package org.example;

public class NewEmployee {
    String name;
    String dateOfBirth;
    int salary;

    public NewEmployee(String name, String dateOfBirth, int salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;

    }



    public int compareDates(String otherDate) {
        String[] date1 = dateOfBirth.split("-");
        String[] date2 = otherDate.split("-");

        // Преобразуем строки в целые числа
        int year1 = Integer.parseInt(date1[0]);
        int month1 = Integer.parseInt(date1[1]);
        int day1 = Integer.parseInt(date1[2]);

        int year2 = Integer.parseInt(date2[0]);
        int month2 = Integer.parseInt(date2[1]);
        int day2 = Integer.parseInt(date2[2]);

        // Сравниваем годы
        if (year1 < year2) {
            return -1;
        } else if (year1 > year2) {
            return 1;
        }

        // Если годы равны, сравниваем месяцы
        if (month1 < month2) {
            return -1;
        } else if (month1 > month2) {
            return 1;
        }

        // Если месяцы равны, сравниваем дни
        if (day1 < day2) {
            return -1;
        } else if (day1 > day2) {
            return 1;
        }

        // Если даты полностью совпадают
        return 0;
    }


}
