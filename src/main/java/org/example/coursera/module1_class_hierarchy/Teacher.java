package org.example.coursera.module1_class_hierarchy;

public class Teacher extends Employee{
    public String subject;
    public String qualification;

    public Teacher(String name, Date dateOfBirth,  Date dateOfAppointment,  String qualification,String subject, int salary) {
        super(name, dateOfBirth, dateOfAppointment, salary);

        this.subject = subject;
        this.qualification = qualification;

    }

    @Override
    public void getDetails() {
        System.out.println("Teacher Name: " + this.name);
        System.out.println("Date of Birth: " + this.dob.getDate());
        System.out.println("Date of Appointment: " + this.dateOfAppointment.getDate());
        System.out.println("Subject: " + this.subject);
        System.out.println("Qualification: " + this.qualification);
        System.out.println("Salary: " + this.getSalary());

    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
