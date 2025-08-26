package collections;


import java.util.Deque;
import java.util.LinkedList;



public class LinkedListUsingDeque {

	public static void main(String[] args) {
		Deque<String> al = new LinkedList<String>();
		// add elements
		al.addFirst("Python");
		al.addLast("Java");
	    al.addFirst("C");
		al.addLast("C++");
		System.out.println(al);
		// access the first element
		System.out.println(al.peek());
		// remove 
		System.out.println(al.remove());
		System.out.println(al);
		// poll
		System.out.println(al.poll());
		System.out.println("Al after addition: " + al);
	
		// get elements
		System.out.println("First element: " + al.getFirst());
	    System.out.println("Last element: " + al.getLast());
		// remove elements
	    al.removeFirst();
	    al.removeLast();
		System.out.println("Al after removals: " + al);
		
	    
		
		

	}

}
