package com.company;

import java.util.ArrayList;
import java.util.List;

// -------------------------------
// Created on 13/04/18 - 11.27
// -------------------------------
public class Employee {
    private String name;
    private String dept;
    private String job;
    private List<Employee> subordinates;

    public Employee(String name, String dept, String job){
        this.name = name;
        this.dept = dept;
        this.job = job;
        subordinates = new ArrayList<>();
    }

    public void addSubordinate(Employee employee){
        subordinates.add(employee);
    }

    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee : name{"+name+"}, dept{"+dept+"}, job{"+job+"}");
    }


}
