package collections;

import java.util.Set;
import java.util.TreeSet;

public class SetsEg {

	public static void main(String[] args) {
		// TreeSet example
		// contains no duplicate elements
		// at most one null element
		// non synchronized
		// data is displayed in ascending order
		// operations are faster than the lists interface
		
		Set<String> st = new TreeSet<String>();
		st.add("orange");
		st.add("banana");
		st.add("grapes");
		st.add("apple");
		st.add("pineapple");
		st.add("null");
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.remove("apple"));
		System.out.println(st);
		System.out.println(st.add("King"));
		System.out.println(st);
		System.out.println(st.size());

		
	}

}
