package com.taskProject.taskprojectservices.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.taskProject.taskprojectservices.dao.TaskDAO;
import com.taskProject.taskprojectservices.model.Task;
import com.taskProject.taskprojectservices.model.Tasks;

@RestController
@RequestMapping(path = "/Tasks")
public class TaskController 
{
    @Autowired
    private TaskDAO TaskDao;
    
    @GetMapping(path = "/list", produces = "application/json")
    public Tasks getTasks() 
    {
        return TaskDao.getAllTasks();
    }
    
    @GetMapping(path = "/list/{taskid}", produces = "application/json")
    public Task getTaskDetail(@PathVariable("taskid") int taskid) 
    {
        return TaskDao.getAllTasks().getTaskList().get(taskid);
    }
    
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addTask(
                        @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
                        @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
                        @RequestBody Task Task) 
                 throws Exception 
    {       
        //Generate resource id
        Integer id = TaskDao.getAllTasks().getTaskList().size() + 1;
        Task.setId(id);
        
        //add resource
        TaskDao.addTask(Task);
        
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(Task.getId())
                                    .toUri();
        
        //Send location in response
        return ResponseEntity.created(location).build();
    }
}
