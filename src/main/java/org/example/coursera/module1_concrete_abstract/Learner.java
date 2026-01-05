package org.example.coursera.module1_concrete_abstract;

public class Learner implements Assessment {
    protected String name;
    protected Course course;
    protected double gradeScore = 0.0;

    Learner(String name, Course course) {
        this.course = course;
        this.name = name;
    }
    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.getSubject().toString();
    }
    public double calculateGrade() {
        int maxAssignmentMarks, maxQuizMarks;
        if (this.course.getSubject().title.contains("Online")) {
            maxAssignmentMarks = 30;
            maxQuizMarks = 10;


        } else {

            maxAssignmentMarks = 100;
            maxQuizMarks = 30;


        }


        double assignmentPercentage = ((double) this.course.getAssignmentMarks() * 10 ) / maxAssignmentMarks;
        double quizPercentage = ((double) this.course.getQuizMarks() * 10) / maxQuizMarks;
        this.gradeScore = (assignmentPercentage + quizPercentage) / 2;
        return this.gradeScore;
    }
    @Override
    public void assignmentScore(int marks) {
        this.course.setAssignmentMarks(marks);
    }

    @Override
    public void quizScore(int marks) {
        this.course.setQuizMarks(marks);

    }
}
