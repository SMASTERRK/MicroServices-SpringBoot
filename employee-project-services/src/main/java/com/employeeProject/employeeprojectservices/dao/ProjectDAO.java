package com.employeeProject.employeeprojectservices.dao;

import org.springframework.stereotype.Repository;

import com.employeeProject.employeeprojectservices.model.Project;
import com.employeeProject.employeeprojectservices.model.Projects;

@Repository
public class ProjectDAO 
{
    private static Projects list = new Projects();
    
    static 
    {
        list.getProjectList().add(new Project(1, "RCP", "Cash Processing"));
        list.getProjectList().add(new Project(2, "eOPS", "Upgraded version of FileNet"));
        list.getProjectList().add(new Project(3, "FlowBanker", "Module of the eOPS"));
    }
    
    public Projects getAllProjects() 
    {
        return list;
    }
    
    public void addProject(Project Project) {
        list.getProjectList().add(Project);
    }
}
