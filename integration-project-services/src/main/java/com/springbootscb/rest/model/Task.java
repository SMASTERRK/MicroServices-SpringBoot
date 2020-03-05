package com.springbootscb.rest.model;

import java.util.List;

public class Task {

    public Task() {

    }

    public Task(Integer id, List<String> taskName) {
        super();
        this.id = id;
        this.taskDetails = taskName;
    }
 
    private Integer id;
    private List<String> taskDetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public List<String> getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(List<String> taskDetails) {
        this.taskDetails = taskDetails;
    }

    @Override
    public String toString() {
        return "Task [id=" + id + ", Task List=" + taskDetails+"]";
    }
}
