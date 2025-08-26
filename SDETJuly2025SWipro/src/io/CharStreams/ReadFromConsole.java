package io.CharStreams;

import java.util.Scanner;

public class ReadFromConsole {
	    public static void main(String[] args) {
	        //  read input from the console
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for name
	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine(); // Reads a line of text

	        System.out.println("Welcome, " + name + " ");

	        scanner.close(); 
	    }
	}


