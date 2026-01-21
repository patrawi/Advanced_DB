package org.example.coursera.ds_alg_module_1_stack;

import java.util.Stack;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        // TODO 1: initialize the stack array
        stack = new String[size];
        // TODO 2: set initial top index to -1
        this.top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        if(top == stack.length -1) {
            System.out.println("Stack is full");
            return;
        }
        top += 1;
        stack[top] = action;
        System.out.printf("\n %s has been added to the stack", action);
        // TODO 3: check if the stack is full
        // TODO 4: print message if the stack is full
        // TODO 5: increment top and add action to the stack
        // TODO 6: print confirmation message
    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        if(top == -1) {
            System.out.println("The stack is empty");
            return null;
        }
        String last = stack[top];
        top -=1;
        System.out.printf("Remove the undone action %s \n", last);
        // TODO 7: Check if the stack is empty
        // TODO 8: Print message if the stack is empty and return null
        // TODO 9: Retrieve and remove the top action from the stack
        // TODO 10: Print confirmation message, return and replace empty string with the undone action
        return last;

    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        if (top == -1) {
            System.out.println("The stack is empty");
            return null;
        }

        // TODO 11: Check if the stack is empty
        // TODO 12: Print message if the stack is empty and return null
        // TODO 13: Return and replace empty string with the most recent action without removing it
        return stack[top];
    }

    // Method to display all actions in the stack
    public void display() {
        if (top == -1) {
            System.out.println("The stack is empty");
            return;
        }

        // TODO 14: Check if the stack is empty

        // TODO 15: Print message if the stack is empty

        // TODO 16: Iterate through the stack and print each action
        for (int i =0 ; i< top; i++) {
            System.out.printf("Action: %s \n", stack[i]);
        }
        // TODO 17: Print a new line after displaying all actions
    }}
