package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetEg {

	public static void main(String[] args) {
		// no duplicates are allowed
		// insertion order
		// only one null is allowed
		// non synchronized
		// slightly slower performance than hash set due to order maintenance
		
				
				
			
						
						LinkedHashSet<String> st = new LinkedHashSet<String>();
						st.add("Ram");
						st.add("Shyam");
						st.add("Rabi");
						st.add("Ajay");
						st.add("Sujay");
						st.add("Null");
						st.add("Null");
						st.add("Sujay");
						
						System.out.println(st);
						System.out.println(st.isEmpty());
						System.out.println(st.remove("Ajay"));
						System.out.println(st);
						System.out.println(st.add("Pranay"));
						System.out.println(st);
						System.out.println(st.size());

						
					}

				

			




	}


