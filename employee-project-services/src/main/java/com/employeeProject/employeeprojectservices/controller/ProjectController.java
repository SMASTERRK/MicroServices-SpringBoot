package com.employeeProject.employeeprojectservices.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.employeeProject.employeeprojectservices.dao.ProjectDAO;
import com.employeeProject.employeeprojectservices.model.Project;
import com.employeeProject.employeeprojectservices.model.Projects;

@RestController
@RequestMapping(path = "/Projects")
public class ProjectController 
{
    @Autowired
    private ProjectDAO ProjectDao;
    
    @GetMapping(path = "/list", produces = "application/json")
    public Projects getProjects() 
    {
        return ProjectDao.getAllProjects();
    }
    
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addProject(
                        @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
                        @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
                        @RequestBody Project Project) 
                 throws Exception 
    {       
        //Generate resource id
        Integer id = ProjectDao.getAllProjects().getProjectList().size() + 1;
        Project.setId(id);
        
        //add resource
        ProjectDao.addProject(Project);
        
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(Project.getId())
                                    .toUri();
        
        //Send location in response
        return ResponseEntity.created(location).build();
    }
}
