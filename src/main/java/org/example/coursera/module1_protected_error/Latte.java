package org.example.coursera.module1_protected_error;

import java.util.Objects;

public class Latte extends Coffee {
    String milkType;
    String syrupFlavor;

    // TODO 12: declare that the constructors throws a InvalidTypeException
    public Latte(String name, String roast, double price, String milkType, String syrupFlavor) throws IllegalArgumentException{
        super(name, roast, price);
        if (!Objects.equals(milkType, "whole") && !Objects.equals(milkType, "skim") && !Objects.equals(milkType, "almond") && !Objects.equals(milkType, "oat")) {
            throw new IllegalArgumentException("Please select a valid milk type!");
        }
        this.milkType = milkType;
        this.syrupFlavor = syrupFlavor;
    }

    public void printLatteDetails() {
        System.out.println("Your latte has " + milkType + " milk and " + syrupFlavor + " flavor.");
        System.out.println("Your total bill is " + price + "$.");
    }
}
