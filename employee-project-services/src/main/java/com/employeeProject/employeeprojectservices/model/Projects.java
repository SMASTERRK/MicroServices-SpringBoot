package com.employeeProject.employeeprojectservices.model;

import java.util.ArrayList;
import java.util.List;

public class Projects 
{
    private List<Project> ProjectList;
    
    public List<Project> getProjectList() {
        if(ProjectList == null) {
            ProjectList = new ArrayList<>();
        }
        return ProjectList;
    }
 
    public void setProjectList(List<Project> ProjectList) {
        this.ProjectList = ProjectList;
    }
}
