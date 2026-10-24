/**
 *  Java program to create, display, update, and delete instance of Stack typed Vector.
 */

package com.mycollections;

import java.util.Stack;
import java.util.Vector;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Vector<Integer> myStack = new Stack<>();

        // Display.
        System.out.println("Stack: " + myStack); // Output: Stack: []

        // Add.
        myStack.add(123);
        myStack.add(-128);
        myStack.add(127);
        myStack.add(0);

        // Display.
        System.out.println("Stack: " + myStack); // Output: Stack: [123, -128, 127, 0]

        // Print first.
        System.out.println("First element: " + myStack.firstElement()); // Output: First element: 123

        // Display.
        System.out.println("Stack: " + myStack); // Output: Stack: [123, -128, 127, 0]

        // Clear.
        myStack.clear();
    }
}