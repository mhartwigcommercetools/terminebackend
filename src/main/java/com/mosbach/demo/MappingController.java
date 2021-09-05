package com.mosbach.demo;

import com.mosbach.demo.dataManagerImpl.PostgresTaskManagerImpl;
import com.mosbach.demo.model.alexa.AlexaRO;
import com.mosbach.demo.model.alexa.OutputSpeechRO;
import com.mosbach.demo.model.alexa.ResponseRO;
import com.mosbach.demo.model.student.Student;
import com.mosbach.demo.model.task.Task;
import com.mosbach.demo.model.task.TaskList;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1.0")
public class MappingController {

    // TODO
    // The student is completely ignored.
    //

    // TODO
    // delete, update, get by id, get sorted, ...
    //

    // TODO
    // Set the used DataProvider (ProperyFileManager, PostgresMaganer) here and not in TaskList
    //


    @GetMapping("/task/all")
    public TaskList getTasks(@RequestParam(value = "name", defaultValue = "Student") String name) {

        TaskList taskList = new TaskList(
                                    new Student("me", name)
                            );
        taskList.setTasks();

        return taskList;
    }


    @PostMapping(
            path = "/task",
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    @ResponseStatus(HttpStatus.OK)
    public String createTask(@RequestBody Task task) {

        TaskList taskList = new TaskList(
                                    new Student("me", "ignore")
                            );
        taskList.addTask(task);
        return task.getName();
    }


    @PostMapping(
            path = "/task/createtable"
    )
    @ResponseStatus(HttpStatus.OK)
    public String createTask() {

        final PostgresTaskManagerImpl postgresTaskManagerImpl =
                PostgresTaskManagerImpl.getPostgresTaskManagerImpl();
        postgresTaskManagerImpl.createTableTask();

        return "Database Table created";
    }



    @PostMapping(
            path = "/alexa",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public AlexaRO getTasks(@RequestBody AlexaRO alexaRO) {

        String outText = "";

        if (alexaRO.getRequest().getType().equalsIgnoreCase("LaunchRequest")) {
            outText = outText + "Welcome to the Mosbach Task Organizer. ";
            alexaRO = prepareResponse(alexaRO, outText, false);
        }
        else {
            if (alexaRO.getRequest().getType().equalsIgnoreCase("IntentRequest") &&
                    (alexaRO.getRequest().getIntent().getName().equalsIgnoreCase("TaskReadIntent"))) {
                try
                {
                    TaskList taskList = new TaskList(
                            new Student("me", "ignore")
                    );
                    taskList.setTasks();

                    outText = outText + "You have to do the following tasks. ";
                    int i = 1;
                    for (Task temp : taskList.getTasks()) {
                        outText = outText + "Number " + i + " . ";
                        outText = outText + temp.getName() + ", priority " + temp.getPriority() + " . ";
                        i++;
                    }
                }
                catch(Exception e) {
                    outText = "Unfortunately, we cannot reach heroku. Our REST server is not responding. ";
                }
                alexaRO = prepareResponse(alexaRO, outText, true);
            }
        }

        return alexaRO;
    }

    private AlexaRO prepareResponse(AlexaRO alexaRO, String outText, boolean shouldEndSession) {

        alexaRO.setRequest(null);
        alexaRO.setSession(null);
        alexaRO.setContext(null);
        OutputSpeechRO outputSpeechRO = new OutputSpeechRO();
        outputSpeechRO.setType("PlainText");
        outputSpeechRO.setText(outText);
        ResponseRO response = new ResponseRO(outputSpeechRO, shouldEndSession);
        alexaRO.setResponse(response);
        return alexaRO;
    }

}
