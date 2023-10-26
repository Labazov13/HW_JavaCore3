package org.example;

public class Supervisor extends NewEmployee{

    public Supervisor(String name, String dateOfBirth, int salary) {
        super(name, dateOfBirth, salary);
    }
    public static void setSalary(NewEmployee emp) {
        if(emp instanceof NewEmployee){
            emp.salary += 5000;
        }
        else {
            System.out.println("Работник является Руководителем");
        }

    }
}
