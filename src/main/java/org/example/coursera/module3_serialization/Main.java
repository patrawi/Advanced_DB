package org.example.coursera.module3_serialization;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {

        Player gameMaster13 = new Player("GameMaster13", 7 , 2120);
        try (
                FileOutputStream fileOutputStream = new FileOutputStream("player.ser");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
                ) {
            objectOutputStream.writeObject(gameMaster13);
            System.out.println("Player object serialized and saved to player.ser!");

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found");
        } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }

        Player restoredPlayer = null;
        try (
                FileInputStream fileInputStream = new FileInputStream("player.ser");
                ObjectInputStream objectinputStream = new ObjectInputStream(fileInputStream)

                ) {
            Object restoredObject = objectinputStream.readObject();
            restoredPlayer = (Player) restoredObject;
            System.out.println("restoredObject = " + restoredObject);

        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File Not Found");

        } catch(IOException | ClassNotFoundException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
