package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEg {

	public static void main(String[] args) {
		Map<Integer, String>map = new HashMap<Integer, String>();
		map.put(1, "Amit");
		map.put(2, "Vijay");
		map.put(5, "Puja");
		map.put(3, "Rahul");
		map.put(1, "Amit");
		map.put(4, "Amit");
		map.put(null, "Arati");
		map.put(null, "Priya");
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
