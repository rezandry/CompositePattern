package com.company;


public class Main {

    public static void main(String[] args) {
        Employee CTO = new Employee("Dennis", "IT", "CTO");
        Employee projectManager = new Employee("Fidia", "IT", "Project Manager");
        Employee backendEngineer = new Employee("Reza", "IT", "Backend Engineer");
        Employee frontendEngineer = new Employee("Abdul", "IT", "Frontend Engineer");

        CTO.addSubordinate(projectManager);
        projectManager.addSubordinate(backendEngineer);
        projectManager.addSubordinate(frontendEngineer);

        System.out.println("-Level 1-");
        System.out.println(CTO.toString());
        CTO.getSubordinates().forEach(employee -> {
            System.out.println("-Level 2-");
            System.out.println(employee.toString());
            employee.getSubordinates().forEach(employee1 -> {
                System.out.println("-Level 3-");
                System.out.println(employee1.toString());
            });
        });

//        cto;
//        - projectManager;
//        -- backendEngineer;
//        -- frontendEngineer;

    }
}
