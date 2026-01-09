package org.example.coursera.module3_closing_stream;

public class Person {
    protected String name;
    protected int age;
    protected double weight;

    Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public String toString() {
        return String.format("Hello, my name is %s and my age is %d.My weight is %f", this.name, this.age, this.weight );
    }
}
