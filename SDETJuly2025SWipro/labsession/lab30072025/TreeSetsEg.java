package collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetsEg {

	public static void main(String[] args) {
		// TreeSet example
		// contains no duplicate elements
		// no null values are allowed
		// non synchronized
		// data is displayed in ascending order
		// operations are faster than the lists interface
		
		Set<Integer> st = new TreeSet<Integer>();
		st.add(5);
		st.add(10);
		st.add(15);
		st.add(20);
		st.add(25);
		
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.remove(10));
		System.out.println(st);
		System.out.println(st.add(30));
		System.out.println(st);
		System.out.println(st.size());

		
	}

}
