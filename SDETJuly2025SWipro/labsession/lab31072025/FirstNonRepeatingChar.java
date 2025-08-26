package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
        // Input string to find the first non-repeating character
        String input = "Java";

        // Create LinkedHashMap to store characters and their counts
        // LinkedHashMap preserves insertion order
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            // If character already exists, increment its count
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Traverse the LinkedHashMap to find the first character with count 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                // Print the first non-repeating character and exit loop
                System.out.println("First non-repeating character: " + entry.getKey());
                return; // exit after finding the first one
            }
        }

        // If no non-repeating character is found
        System.out.println("No non-repeating character found.");
    }
}

