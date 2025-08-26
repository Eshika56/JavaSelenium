package collections;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		// no duplicate elements allowed
		// no guaranteed order
		// multiple null values are allowed but prints only one
		// not synchronized
		// operations are faster than the lists interface
		
		
	
				
				HashSet<String> st = new HashSet<String>();
				st.add("Ram");
				st.add("Shyam");
				st.add("Rabi");
				st.add("Ajay");
				st.add("Sujay");
				st.add("Null");
				st.add("Null");
				
				System.out.println(st);
				System.out.println(st.isEmpty());
				System.out.println(st.remove("Ajay"));
				System.out.println(st);
				System.out.println(st.add("Pranay"));
				System.out.println(st);
				System.out.println(st.size());

				
			}

		

	}


