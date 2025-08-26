package collections;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMapEg {

	public static void main(String[] args) {
/*
1. An object that maps keys to values
2. A map cannot contain duplicate keys
3. Each key can map to at most one value
4. Ordering - it is sorted based on the natural ordering of its keys
5. Values can be duplicated
6. No null as key is allowed
7. Multiple null values are allowed  
8. not synchronized 
 */
		Map<Integer, String>map = new TreeMap<Integer, String>();
		map.put(1, "Amit");
		map.put(2, "Vijay");
		map.put(5, "Puja");
		map.put(3, "Rahul");
		map.put(1, "Amit");
		map.put(4, "Amit");
		map.put(6, null);
		map.put(7, null);
		
		
		map.put(6, null);
		map.put(7, null);
		// System.out.println(map);
		// converting the map to the set
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}




	}


