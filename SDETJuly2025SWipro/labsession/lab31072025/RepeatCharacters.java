package io.ByteStreams;

public class RepeatCharacters {
	// Write a Java Program to generate Output "aabbbcccc" with the input "a2b3c4"

	
	    public static void main(String[] args) {
	        // Input string in the format of character followed by number
	        String input = "a2b3c4";

	        // StringBuilder is used for efficient string concatenation
	        StringBuilder output = new StringBuilder();

	        // Loop through input string two characters at a time
	        for (int i = 0; i < input.length(); i += 2) {
	            // Get the character (like 'a', 'b', 'c')
	            char ch = input.charAt(i);

	            // Get the digit after the character and convert it from char to integer
	            int count = input.charAt(i + 1) - '0';

	            // Append the character 'count' number of times to output
	            for (int j = 0; j < count; j++) {
	                output.append(ch);
	            }
	        }

	        // Print the final result
	        System.out.println(output.toString());
	    }
	}


