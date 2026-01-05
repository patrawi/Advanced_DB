package org.example.coursera.module1_abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("Calculating Area of Rectangle: ");
        System.out.print("Enter Width: ");
        float w = keyBoard.nextFloat();
        System.out.print("Enter height: ");
        float h = keyBoard.nextFloat();
        Rectangle rct = new Rectangle(w, h);
        rct.draw();
        System.out.println("Area: "+rct.calculatedArea());
        System.out.println("Calculating perimeter of rectangle: ");
        System.out.println("Perimeter: " + rct.calculatedPerimeter());
        System.out.println("Calculating Area of Circle: ");
        System.out.print("Enter radius: ");
        float r = keyBoard.nextFloat();
        Circle cr = new Circle(r);
        cr.draw();
        System.out.println("Area: "+cr.calculatedArea());
        System.out.println("Calculating perimeter of circle: ");
        System.out.println("Perimeter: "+cr.calculatedPerimeter());




    }
}
