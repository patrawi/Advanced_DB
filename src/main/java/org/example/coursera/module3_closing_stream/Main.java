package org.example.coursera.module3_closing_stream;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void textFileWrite(){
        Person person = new Person("Mike", 25, 72);
        String hisDetail = person.toString();
        try (FileWriter fileWriter = new FileWriter("/Users/pirawatwareetanyarat/IdeaProjects/Advanced Database/src/main/java/org/example/coursera/module3_closing_stream/file1.txt")) {

            fileWriter.write(hisDetail);
            System.out.println("File written with FileWriter ...");


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printWrite() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your weight: ");
        double weight =scanner.nextDouble();
        scanner.nextLine();
        Person person = new Person(input,age, weight);
        try (FileWriter fileWriter = new FileWriter("/Users/pirawatwareetanyarat/IdeaProjects/Advanced Database/src/main/java/org/example/coursera/module3_closing_stream/file2.txt")) {
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(person.toString());
            System.out.println("File written with FileOutputStream...");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void writeBinaryNumbers() throws FileNotFoundException {
        byte[] bytes = {1,2,3,4,5,6,7,8,9};
        try (FileOutputStream fileOutputStream = new FileOutputStream("/Users/pirawatwareetanyarat/IdeaProjects/Advanced Database/src/main/java/org/example/coursera/module3_closing_stream/file3.dat")) {
            for (byte b : bytes) {
                fileOutputStream.write(b);
            }
            System.out.println("File written with PrintWriter...");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writePersonBinary() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String input = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your weight: ");
        double weight =scanner.nextDouble();
        Person person = new Person(input,age, weight);

        try (FileOutputStream fileOutputStream = new FileOutputStream("/Users/pirawatwareetanyarat/IdeaProjects/Advanced Database/src/main/java/org/example/coursera/module3_closing_stream/fil4.dat")) {
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF(input);
            dataOutputStream.writeInt(age);
            dataOutputStream.writeDouble(weight);
            System.out.println("File written with DataOutputStream...");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) throws IOException {
        writePersonBinary();
    }
}
