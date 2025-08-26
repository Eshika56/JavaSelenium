package coreJava;

import java.util.Scanner;

public class ReverseNumber {

	    public static void main(String[] args) {

	        // Creating Scanner object to read input from user
	        Scanner sc = new Scanner(System.in);

	        // Prompting user to enter a number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();  // Reading the number

	        int original = num;      // Storing original number for comparison
	        int reverse = 0;         // Variable to store reversed number

	        // Loop to reverse the number
	        while(num != 0) {
	            int digit = num % 10;        // Get last digit
	            reverse = reverse * 10 + digit; // Add digit to reversed number
	            num = num / 10;              // Remove last digit
	        }

	        // Printing the reversed number
	        System.out.println("Reversed Number: " + reverse);

	        // Checking if original number and reversed number are same
	        if(original == reverse) {
	            System.out.println("The entered number is the same as its reverse.");
	        } else {
	            System.out.println("The entered number is not the same as its reverse.");
	        }

	        sc.close(); // Closing the scanner
	    }
	}

