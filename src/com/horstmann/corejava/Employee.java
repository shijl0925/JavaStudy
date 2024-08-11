package com.horstmann.corejava;

import java.util.Objects;
import java.time.LocalDate;
import java.util.Random;

public class Employee {
    private static int nextId = 1;
    private final String name;
    private double salary;
    private final LocalDate hireDay;
    private final int id;

    // static initialization block
    static {
        var generator = new Random();
        nextId = generator.nextInt(10000);
    }

    // instance initialization block
    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        Objects.requireNonNull(name, "The name cannot be null");

        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public int getId() {
        return this.id;
    }

//    public void setId() {
//        this.id = nextId;
//        nextId++;
//    }

    public static int getNextId() {
        return nextId; // static method return static field
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public LocalDate getHireDay() {
        return this.hireDay;
    }

    /* Raise the salary by the specified percentage
    * @param byPercent the percentage of the raise
    * @return the new salary
    */
    public void raiseSalary(double byPercent) {
        this.salary *= (1.0 + byPercent / 100);
    }

    public boolean equals(Employee other) {
        return this.name.equals(other.name);
    }
}
