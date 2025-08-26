package io.ByteStreams;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// Write a Java Program to print the second largest number in a given array.
		// Declare  an array of integers
        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        //  two variables to store the largest and second largest values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int num : numbers) {
            if (num > largest) {
                // If current number is greater than the largest, update both
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // If current number is greater than secondLargest and not equal to largest
                secondLargest = num;
            }
        }

        // Check if second largest was updated
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }


	}


