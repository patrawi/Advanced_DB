package org.example.coursera.module1_concrete_abstract;

public class ClassroomCourse extends Course{
    protected String school;
    protected String session;
    ClassroomCourse(Subject subject, String instructor, int fee, String school, String session ) {
        super(subject, instructor, fee);
        this.session = session;
        this.school = school;
    }
}
