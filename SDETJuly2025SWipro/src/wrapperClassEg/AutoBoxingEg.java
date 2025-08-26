package wrapperClassEg;

public class AutoBoxingEg {
	public static void main(String[] args) {
		// wrapper is the process of converting the primitive data types into objects
		// 8 wrapper classes - Byte, Boolean, Character, Double, Float, Integer, Long, Short
		// autoboxing convert data type to object
		int a = 78;
		// autoboxing
		// Integer i = Integer.valueOf(a);
		Integer i = a;
		System.out.println(i);
	}

}
