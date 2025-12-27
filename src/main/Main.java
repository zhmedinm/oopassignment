package main;

import model.*;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Uldana", 3.1);
        s.study();
        s.passExam();
        System.out.println("GPA: " + s.getGpa());
        System.out.println("Type: " + s.getType());

        System.out.println("-----");

        Employee e = new Employee("Merey", "Economy", 350000);
        System.out.println("Type: " + e.getType());
        e.work();
        e.showSalary();
        e.study();
        e.passExam();
    }
}
