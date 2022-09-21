package com.mosbach.demo.dataManagerImpl;

import com.mosbach.demo.dataManager.TaskManager;
import com.mosbach.demo.model.student.Student;
import com.mosbach.demo.model.task.Task;
import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Properties;

public class PostgresTaskManagerImpl implements TaskManager  {

    String databaseURL = "jdbc:postgresql://ec2-3-81-240-17.compute-1.amazonaws.com:5432/d9l0o5gfhlc5co";
    String username = "wrong";
    String password = "very_wrong";
    BasicDataSource basicDataSource;

    static PostgresTaskManagerImpl postgresTaskManager = null;

    private PostgresTaskManagerImpl() {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(databaseURL);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
    }

    static public PostgresTaskManagerImpl getPostgresTaskManagerImpl() {
        if (postgresTaskManager == null)
            postgresTaskManager = new PostgresTaskManagerImpl();
        return postgresTaskManager;
    }


    @Override
    public Collection<Task> getAllTasks(Student student) {

        List<Task> tasks = new ArrayList<>();

        return tasks;
    }

    @Override
    public void addTask(Task task, Student student) {

        Statement stmt = null;
        Connection connection = null;


    }

    public void createTableTask() {

        // Be carefull: It deletes data if table already exists.
        //
        Statement stmt = null;
        Connection connection = null;


    }


}
