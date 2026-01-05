package org.example.coursera.module1_class_hierarchy;


public abstract class Person {
    protected String name;
    protected Date dob;
    public Person(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public abstract void getDetails();
}
