package org.example;


import static org.example.Supervisor.setSalary;

public class Main {
    public static void main(String[] args) {
        NewEmployee employee1 = new NewEmployee("Иван", "1990-05-15", 55000);
        NewEmployee employee2 = new NewEmployee("Петр", "1990-05-15", 50000);
        Supervisor supervisor = new Supervisor("Андрей", "1980-01-25", 90000);
        int result = employee1.compareDates(employee2.dateOfBirth);
        if (result < 0) {
            System.out.println(employee1.name + " родился раньше " + employee2.name);
        } else if (result > 0) {
            System.out.println(employee1.name + " родился позже " + employee2.name);
        } else {
            System.out.println(employee1.name + " и " + employee2.name + " родились в один день");
        }
        setSalary(employee1);
        setSalary(employee2);
    }
}