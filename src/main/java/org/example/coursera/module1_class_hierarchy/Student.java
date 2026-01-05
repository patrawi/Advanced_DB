package org.example.coursera.module1_class_hierarchy;

public class Student extends Person{
    private final String  subject;
    private final Teacher teacher;
    public Student(String name,Date dateOfBirth, Teacher teacher, String subject) {
        super(name, dateOfBirth);
        this.subject = subject;
        this.teacher = teacher;

    }

    @Override
    public void getDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Date of Birth: " + dob.getDate());
        System.out.println("Subject" + subject);
        System.out.println("Teacher Name: " + teacher.name);
        System.out.println("Teacher Subject: " + teacher.subject);
        System.out.println("Teacher Qualification: " + teacher.qualification);
        System.out.println("Teacher Salary: " + teacher.getSalary());
        System.out.println("----------------------------");

    }

}
