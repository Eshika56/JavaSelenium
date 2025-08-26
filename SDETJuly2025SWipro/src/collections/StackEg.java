package collections;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		// stack represents a last-in-first-out(LIFO)
		Stack<String> stack = new Stack<String>();
		stack.add("Banana");
		stack.add("Orange");
		stack.add("Apple");
		
		System.out.println(stack.empty());
		System.out.println(stack.peek()); // LIFO
		System.out.println(stack);
		System.out.println(stack.pop()); // removes the top element
		System.out.println(stack);
		System.out.println(stack.push("Banana")); // pushes the element on the top of the stack
		System.out.println(stack);
		System.out.println(stack.search("Orange")); // search returns 1-based position
		
	
		

	}

}
