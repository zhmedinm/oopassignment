package oopassignment;

public class Employee extends Human {

    private String position;
    private float salary;

    public static int count = 0;

    public Employee(int age, String name, boolean alive,
                    String position, float salary) {

        super(age, name, alive);
        this.position = position;
        this.salary = salary;

        count++;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String role() {
        return "Employee";
    }
}
