package collections;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		// creation
		// accessing the data
		// updating the data
		// removing of data
		ArrayList<String> al = new ArrayList<String> ();
		// insertion of that data
		al.add("Ravi");
		al.add("John");
		al.add("Tina");
		al.add("Peter");
		al.add("Sanjay");
		al.add("Rima");
		al.add("Ravi");
		al.add(null);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.indexOf("Peter"));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.set(4, "King"));
		System.out.println(al);
		System.out.println(al.size());
	}

}
