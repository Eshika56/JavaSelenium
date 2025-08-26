package collections;

import java.util.LinkedList;

public class CompareLinkedList {
	
	    public static void main(String[] args) {
	        // Create first LinkedList
	        LinkedList<String> list1 = new LinkedList<String>();
	        list1.add("Adi");
	        list1.add("Bira");
	        list1.add("Sumit");

	        // Create second LinkedList
	        LinkedList<String> list2 = new LinkedList<String>();
	        list2.add("Adi");
	        list2.add("Bira");
	        list2.add("Sumit");

	        // Compare both lists
	         boolean isEqual = list1.equals(list2);

	        System.out.println("Both linkedlists are equal:  " + isEqual);
	    }
	}


