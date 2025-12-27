package model;

import interfaces.IStudyable;

public class Student extends Human implements IStudyable {

    private double gpa;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying");
    }

    @Override
    public void passExam() {
        System.out.println(name + " passed the exam");
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String getType() {
        return "Student";
    }
}
