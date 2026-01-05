package org.example.coursera.module1_class_hierarchy;

public class Date {
    private int date;
    private int month;
    private int year;

    public Date(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        return this.date + "/" + this.month + "/" + this.year;
    }
}
