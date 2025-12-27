package model;

import interfaces.IStudyable;
import interfaces.IWorkable;

public class Employee extends Human implements IStudyable, IWorkable {

    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        super(name);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is working in " + department);
    }

    @Override
    public void study() {
        System.out.println(name + " is learning new skills");
    }

    @Override
    public void passExam() {
        System.out.println(name + " passed a certification exam");
    }

    public void showSalary() {
        System.out.println(name + " received salary: " + salary);
    }

    @Override
    public String getType() {
        return "Employee";
    }
}
