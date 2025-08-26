package coreJava;

import java.util.Scanner;

public class FloatingPointNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Input first floating point number: ");
        double num1 = input.nextDouble();

        System.out.print("Input second floating point number: ");
        double num2 = input.nextDouble();

        // Round both numbers to two decimal places by multiplying and casting
        int n1 = (int) (num1 * 100);
        int n2 = (int) (num2 * 100);

        // Compare the results
        if (n1 == n2) {
            System.out.println("The numbers are the same up to two decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }

        input.close();
    }
}
