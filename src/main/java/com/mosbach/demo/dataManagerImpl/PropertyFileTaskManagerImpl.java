package com.mosbach.demo.dataManagerImpl;

import com.mosbach.demo.dataManager.TaskManager;
import com.mosbach.demo.model.student.Student;
import com.mosbach.demo.model.task.Task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;

public class PropertyFileTaskManagerImpl implements TaskManager {

    String fileName;

    static PropertyFileTaskManagerImpl propertyFileTaskManager = null;

    private PropertyFileTaskManagerImpl(String fileName) {
        this.fileName = fileName;
    }

    static public PropertyFileTaskManagerImpl getPropertyFileTaskManagerImpl(String fileName) {
        if (propertyFileTaskManager == null)
            propertyFileTaskManager = new PropertyFileTaskManagerImpl(fileName);
        return propertyFileTaskManager;
    }



    @Override
    public Collection<Task> getAllTasks(Student student) {

        // I am ignoring the student and retrieve all tasks from the file

        List<Task> tasks = new ArrayList<>();

        return tasks;
    }

    @Override
    public void addTask(Task task, Student student) {
        Collection<Task> tasks = getAllTasks(student);
        tasks.add(task);
        storeAllTasks(tasks, student);
    }


    public void storeAllTasks(Collection<Task> tasks, Student student) {

        // I am ignoring the student and storing all tasks to the file

        Properties properties = new Properties();
    }


}
