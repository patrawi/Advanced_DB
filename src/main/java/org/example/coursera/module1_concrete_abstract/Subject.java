package org.example.coursera.module1_concrete_abstract;

public class Subject {
    protected String title;
    protected double credits;

    Subject(String title, double credits) {
        this.credits = credits;
        this.title = title;
    }

    public String toString() {
        return "Title: " + this.title + " " + "credits: " + this.credits;
    }
}
