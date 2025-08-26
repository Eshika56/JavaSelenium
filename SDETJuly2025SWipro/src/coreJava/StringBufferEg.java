package coreJava;

public class StringBufferEg {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		// mutable in nature
		// append
		sb.append("world");
		System.out.println(sb);
		// string buffer methods
		// reverse, is empty, insert, delete, substring, replace, char at index, index of, length, repeat
// is empty
		System.out.println(sb.isEmpty());
// insert
		System.out.println(sb.insert(4, "Java"));
// delete
		System.out.println(sb.delete(5, 7));
// substring
		System.out.println(sb.substring(3));
// replace
		System.out.println(sb.replace(2, 5, "m"));
// char at index
		System.out.println(sb.charAt(6));
// index of
		System.out.println(sb.indexOf("Ja"));
// length
System.out.println(sb.length());
//reverse
		System.out.println(sb.reverse());

		
		
	}
}
