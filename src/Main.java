package oopassignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Human human = new Human(20, "Ali", true);
        human.sayHello();
        System.out.println(human.role());

        System.out.print("Enter employee name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int empAge = scanner.nextInt();

        System.out.print("Is employee alive? (true/false): ");
        boolean empAlive = scanner.nextBoolean();
        scanner.nextLine(); // buffer

        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        System.out.print("Enter salary: ");
        float salary = scanner.nextFloat();

        Employee employee = new Employee(
                empAge, empName, empAlive, position, salary
        );

        employee.sayHello();
        System.out.println(employee.role());

        Student student = new Student(18, "Aruzhan", true, "IT", 3.6f);
        student.sayHello();
        System.out.println(student.role());

        System.out.println("Employees count: " + Employee.count);

        scanner.close();
    }
}
