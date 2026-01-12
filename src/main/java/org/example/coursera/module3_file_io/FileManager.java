package org.example.coursera.module3_file_io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;

public class FileManager {

    // Define the copyFile method with two parameters: sourcePath and targetPath
    private static void copyFile(String sourcePath, String targetPath) throws IOException {

        // Convert the sourcePath string into a Path object
        Path source = Paths.get(sourcePath);

        // TODO 1: Convert the targetPath string into a Path object
        Path targatPath = Paths.get(targetPath);
        // Use a try-catch block to handle potential I/O exceptions
        try {
            Path pathFile = Files.copy(source, targatPath);
            // TODO 2: Copy the source file to the target location, replacing any existing file

            // TODO 3: Print a message indicating that the file has been successfully copied
            System.out.println("The file has been succesfully copied" + pathFile);
        } catch (IOException e) {

            // TODO 4: If an IOException occurs, print an error message with the exception's message
            System.out.println(e.getMessage());
            // Print the stack trace of the exception for debugging purposes
            e.printStackTrace();
        }
    }

    // Main method to test the copyFile function
    public static void main(String[] args) throws IOException {
        // Specify the source and target file paths
        String sourceFile = "/Users/pirawatwareetanyarat/IdeaProjects/Advanced Database/src/main/java/org/example/coursera/module3_file_io/source_folder/textFile1.txt";
        String targetFile = "/Users/pirawatwareetanyarat/IdeaProjects/Advanced Database/src/main/java/org/example/coursera/module3_file_io/target_folder/textFile1.txt";

        // Call the copyFile method with the specified source and target paths
        copyFile(sourceFile, targetFile);
    }
}
