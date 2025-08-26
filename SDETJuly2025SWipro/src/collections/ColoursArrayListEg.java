package collections;

import java.util.ArrayList;

public class ColoursArrayListEg {




	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String> ();
		// insertion of that data
		al.add("Red");
		al.add("Yellow");
		al.add("Blue");
		al.add("Green");
		al.add("Black");
		al.add("Purple");
		
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Black"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.set(4, "Violet"));
		System.out.println(al);
		System.out.println(al.size());
	}

}

