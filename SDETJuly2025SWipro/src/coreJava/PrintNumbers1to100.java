package coreJava;

public class PrintNumbers1to100 {
	

	    // Method to print numbers from 1 to 100 using recursion
	    public static void printNum(int num) {
	        // Base condition: If number is greater than 100, stop recursion
	        if (num > 100)
	            return;

	        // Print the current number
	        System.out.println(num);

	        // Recursive call with the next number
	        printNum(num + 1);
	    }

	    
	    public static void main(String[] args) {
	        // Start printing from 1
	        printNum(1);
	    }
	}


