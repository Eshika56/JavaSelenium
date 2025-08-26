package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxElementArrayList {
	
	    public static void main(String[] args) {
	        // Create an ArrayList with integers
	        ArrayList<Integer> integers = new ArrayList<Integer>(Arrays.asList(41, 65, 98, 32, 66));

	        //  Collections.max() to find the largest element
	        int max = Collections.max(integers);

	        System.out.println("Maximum Element is: " + max);
	    }
	}


