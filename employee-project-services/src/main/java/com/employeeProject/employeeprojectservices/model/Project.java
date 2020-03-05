package com.employeeProject.employeeprojectservices.model;

public class Project {

    public Project() {

    }

    public Project(int id, String projectName, String desc) {
        super();
        this.id = id;
        this.projectName = projectName;
        this.desc = desc;
    }
 
    private Integer id;
    private String projectName;
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Project [id=" + id + ", ProjectName=" + projectName + ", Description=" + desc + "]";
    }
}
