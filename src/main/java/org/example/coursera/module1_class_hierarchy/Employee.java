package org.example.coursera.module1_class_hierarchy;

public abstract class Employee extends Person {
    protected  Date dateOfAppointment;
    protected int salary;

    public Employee(String name, Date dob,Date dateOfAppointment, int Salary) {
        super(name, dob);
        this.dateOfAppointment = dateOfAppointment;
        this.salary = salary;
    }
    public abstract int getSalary();
    public abstract void setSalary(int salary);
}
