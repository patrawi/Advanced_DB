package org.example.coursera.module1_interfaces;

public class Employee extends Person implements  EmployeeInterface{
    protected int basicPay;
    Employee(String name, int age, int basic) {
        this.name = name;
        this.age = age;
        this.basicPay = basic;
    }
    @Override
    public double computeSalary() {
        double salary;
        salary =  1.5 * basicPay;
        return salary;
    }

    @Override
    public double computeTax() {
        double tax;
        tax = 0.1 * basicPay;
        return tax;
    }
    //TODO 14: override getDetails() method to add print statements to print basicPay, salary and tax
    @Override
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("Salary: " + computeSalary());
        System.out.println("Tax: " + computeTax());
    }
}
