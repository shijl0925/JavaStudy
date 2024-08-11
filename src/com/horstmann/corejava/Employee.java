package com.horstmann.corejava;

import java.util.Objects;
import java.time.LocalDate;
import java.util.Random;

public class Employee extends Person {
    private static int nextId = 1;
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
        super(name);
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

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", this.getSalary());
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

    public boolean equals(Object other) {
        if (this == other) return true;

        if (other == null) return false;

        if (getClass() != other.getClass()) return false;

        Employee otherEmployee = (Employee) other;
        return this.getName().equals(otherEmployee.getName()) &&
                this.getSalary() == otherEmployee.getSalary() &&
                this.getHireDay() == otherEmployee.getHireDay();
//        return Objects.equals(this.getName(), otherEmployee.getName());
    }

    public String toString() {
        return getClass().getName()
                + "[id=" + this.id + ",name=" + this.getName()
                + ",salary=" + this.salary + ",hireDay=" + this.hireDay
                + "]";
    }
}
