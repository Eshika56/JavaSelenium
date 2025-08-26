package collections;

import java.util.Vector;

public class VectorsEg {

	public static void main(String[] args) {
		// growable array of objects
		// zero based index
		// maintains the insertion order
		// stores duplicate elements
		// capacity increment
		// null values allowed
		// synchronized in nature
		

		
		        Vector<String> vector = new Vector<>();

		        // Add elements
		        vector.add("One");
		        vector.add("Two");
		        vector.add("Three");

		        // Insert at specific index
		        vector.add(1, "Two");

		        // Access element
		        System.out.println(vector.get(2));

		        // Remove element
		        vector.remove("One");
		        vector.remove(0); 

		        // Replace element
		        vector.set(1, "Five");

		        // Check size
		        System.out.println(vector.size());

		        // Check if contains
		        System.out.println(vector.contains("Three"));

		        // Iterate
		        System.out.println("Elements:");
		        for (String number : vector) {
		            System.out.println(number);
		        }

		        // Clear all
		        vector.clear();
		        System.out.println(vector.isEmpty());
		        
		        
		    }
		


	}


