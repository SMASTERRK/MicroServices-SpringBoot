package com.taskProject.taskprojectservices.model;

import java.util.ArrayList;
import java.util.List;

public class Tasks 
{
    private List<Task> TaskList;
    
    public List<Task> getTaskList() {
        if(TaskList == null) {
            TaskList = new ArrayList<>();
        }
        return TaskList;
    }
 
    public void setTaskList(List<Task> TaskList) {
        this.TaskList = TaskList;
    }
}
