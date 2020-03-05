package com.springbootscb.rest.dao;

import org.springframework.stereotype.Repository;

import com.springbootscb.rest.model.Employee;
import com.springbootscb.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Ram", "Kumar", "ramkumarramachandran0@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Vivek", "K", "vivek.k1@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Praveer", "Aravind", "Aravind1Praveer@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
