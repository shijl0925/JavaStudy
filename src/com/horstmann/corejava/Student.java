package com.horstmann.corejava;

public class Student extends Person {
    private final String major;
    public Student(String name, String aMajor) {
        super(name);
        this.major = aMajor;
    }

    public String getDescription() {
        return "a student majoring in " + this.major;
    }
}
