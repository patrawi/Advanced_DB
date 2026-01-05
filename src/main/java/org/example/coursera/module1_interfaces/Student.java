package org.example.coursera.module1_interfaces;

public class Student extends Person implements StudentInterface {
    protected String subject;
    protected int marks;

    Student(String name, int age, String subject,int marks) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.marks = marks;
    }

    @Override
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject + "Marks: " + marks);
    }

    @Override
    public void result() {
        if (marks > 50) {
            System.out.println("PASS!");
        } else {
            System.out.println("FAILED");
        }
    }

    @Override
    public void fee(int fee) {
        System.out.println("The student has paid the specified" + fee + " as the argument");
    }
}
