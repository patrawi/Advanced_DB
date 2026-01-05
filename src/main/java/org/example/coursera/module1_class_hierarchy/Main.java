package org.example.coursera.module1_class_hierarchy;

public class Main {
    public static void main(String[] args) {
        Date dateOfStudent = new Date(15,8,2005);
        Date dateOfTeacher = new Date(10,2,1980);
        Date dateOfAppointment = new Date(1,6,2010);

        Teacher teacher = new Teacher("Madhavan",
                dateOfTeacher,
                dateOfAppointment,
                "MTech",
                "Electronics",0 );

        Student student = new Student("Belinda", dateOfStudent, teacher, "Electronics" );

        teacher.setSalary(50000);
        teacher.getDetails();
        System.out.println();
        student.getDetails();
    }
}
