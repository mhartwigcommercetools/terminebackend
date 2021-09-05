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

    // TODO
    // Get all tasks

    // TODO
    // Add a task

    // TODO
    // Create the database table

    // TODO
    // Handle alexa calls


}
