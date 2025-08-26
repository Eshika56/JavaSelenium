package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	
	    public static void main(String[] args) {
	        // ArrayList creation and add integers
	        ArrayList<Integer> numbers = new ArrayList<Integer>();
	        numbers.add(55);
	        numbers.add(10);
	        numbers.add(95);
	        numbers.add(8);
	        numbers.add(36);

	        // ArrayList sort in ascending order
	        Collections.sort(numbers);

	        // the sorted list print
	        System.out.println("Sorted ArrayList: " + numbers);
	    }
	}


