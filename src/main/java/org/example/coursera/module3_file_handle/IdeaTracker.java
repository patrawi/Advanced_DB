package org.example.coursera.module3_file_handle;

import java.util.Scanner;

public class IdeaTracker {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Idea Tracker!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Read Idea from File");
            System.out.println("2. Write Idea to File");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the file path to read from: ");
                    String filePath = keyboard.nextLine();
                    IdeaReader.readIdea(filePath);
                    break;

                case 2:
                    System.out.println("Please enter the name of the idea");
                    filePath ="src/main/java/org/example/coursera/module3_file_handle/" + keyboard.nextLine() + ".txt";
                    System.out.println("Please enter some description for the project: ");
                    String ideaDescription = keyboard.nextLine();
                    IdeaWriter.writeIdea(filePath, ideaDescription);

                    break;

                case 3:
                    System.out.println("Thank you for using the Idea Tracker!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 3);

        keyboard.close();
    }
}
