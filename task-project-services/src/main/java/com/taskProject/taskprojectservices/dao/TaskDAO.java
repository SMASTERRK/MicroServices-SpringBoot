package com.taskProject.taskprojectservices.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.taskProject.taskprojectservices.model.Task;
import com.taskProject.taskprojectservices.model.Tasks;

@Repository
public class TaskDAO 
{
    private static Tasks list = new Tasks();
    
    static 
    {
    	List<String> list1=new ArrayList<String>();
    	list1.add("W179 Process");
    	list1.add("CASH BT Financials");
    	
    	List<String> list2=new ArrayList<String>();
    	list2.add("W838 Process");
    	list2.add("SODEOD - Vietnam Change");
    	
    	List<String> list3=new ArrayList<String>();
    	list3.add("GateKeeper Change");
    	
    	System.out.println(""+list1+list2+list3);
        list.getTaskList().add(new Task(1, list1));
        list.getTaskList().add(new Task(2, list2));
        list.getTaskList().add(new Task(3, list3));
    }
    
    public Tasks getAllTasks() 
    {
        return list;
    }
    
    public void addTask(Task Task) {
        list.getTaskList().add(Task);
    }
}
