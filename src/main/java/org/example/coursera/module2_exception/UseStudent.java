package org.example.coursera.module2_exception;

public class UseStudent {

    public static void main(String[] args) {
        Student s = null;
        printStudent(s);

        Student[] students = new Student[2];
        Student s1 = new Student("Student1",  20);
        Student s2 = new Student("Student2",  21);
        students[0] = s1;
        students[1] = s2;
        listStudent(students);
        thisIsRisky();

    }
    private static void printStudent(Student student) {
        try {
            System.out.println("Name: " + student.getName() + "\n" + "Age: " + student.getAge());

        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
        }

    private static void listStudent(Student[] students) {
        for (int i = 0 ; i <= students.length; i++) {
            try {
                printStudent(students[i]);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void thisIsRisky() {
        int priceTag = 50;
        int discount = 0;
        try {
            System.out.println("Total = " + (priceTag / discount));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
