package oopassignment;

public class Human {

    private int age;
    private String name;
    private boolean alive;

    public Human(int age, String name, boolean alive) {
        this.age = age;
        this.name = name;
        this.alive = alive;
    }

    public void sayHello() {
        System.out.println("Hello, I am " + name);
    }

    public String role() {
        return "Human";
    }
}

