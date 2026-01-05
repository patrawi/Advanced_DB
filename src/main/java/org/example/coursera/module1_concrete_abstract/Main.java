package org.example.coursera.module1_concrete_abstract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {;
        Course course = null;
        System.out.println("Select Subject: ");
        System.out.println("1 = Java \n 2 = Java Online \n 3 = JavaScript \n 4 = JavaScript Online");
        Scanner scanner = new Scanner(System.in);
        int  choice = scanner.nextInt();
        switch (choice) {
            case 1:
                Subject subject1 = new Subject("Java", 4);
                 course = new ClassroomCourse(subject1, "Mark", 1000, "Cambridge", "Winter");
                break;
            case 2:
                Subject subject2 = new Subject("Java Online", 4);

                 course = new OnlineCourse(subject2, "Mark", 1000, 6, 12);
                break;
            case 3:
                Subject subject3 = new Subject("JavaScript", 6);

                 course =new ClassroomCourse(subject3, "Mark", 1200, "Oxford", "Spring");
                break;
            case 4:
                Subject subject4 = new Subject("JavaScript Online", 6);

                 course = new OnlineCourse(subject4, "Mark", 1200, 8, 16);
                break;
            default:
                System.out.println("There is no selected course for this option");

        }
        scanner.nextLine();
        System.out.println("Learner Name: ");
        String leanerName = scanner.nextLine();
        Learner learner = new Learner(leanerName,course);
        System.out.println("Assignment marks: ");
        int mark1 = scanner.nextInt();
        learner.assignmentScore(mark1);
        System.out.println("Quiz marks: ");
        int quiz1 = scanner.nextInt();
        learner.quizScore(quiz1);

        System.out.println("Grade Score: " +         learner.calculateGrade());
        if (learner.gradeScore >= 5) {
            System.out.println("successfully passed");
        } else {
            System.out.println("successfully completed");

        }

    }
}
