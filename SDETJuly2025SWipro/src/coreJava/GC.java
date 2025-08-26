package coreJava;

public class GC {
	// null reference
	// reassigning the reference
	// object is out of scope
	public void finalize() {
		System.out.println("Object is garbage collected");
	}

	public static void main(String[] args) {
		GC obj = new GC();
				// by nulling the reference
		obj = null;
		// by assigning a reference to another object
		GC obj1 = new GC();
		GC obj2 = new GC();
		obj1 = obj2;
		// object is out of scope
		GC obj4 = new GC();
		//System.gc();
		Runtime.getRuntime().gc();
		

	}

}
