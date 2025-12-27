package model;

public abstract class Human {

    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public abstract String getType();
}
