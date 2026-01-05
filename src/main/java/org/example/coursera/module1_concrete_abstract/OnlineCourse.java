package org.example.coursera.module1_concrete_abstract;

public class OnlineCourse extends Course{
    int weeks;
    int videoLessons;
    OnlineCourse(Subject subject, String instructor, int fee, int weeks, int videoLessons) {
        super(subject, instructor, fee);
        this.weeks = weeks;
        this.videoLessons = videoLessons;
    }
}
