package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {
	
	    public static void main(String[] args) {
	        // Creation of an ArrayList of integers
	        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 10,15,20,30));

	        // Sort list in descending order
	        Collections.sort(list,Collections.reverseOrder());

	        // second largest
	        int secondLargest = list.get(1);

	        System.out.println("Second Largest Element: " + secondLargest);
	    }
	}


