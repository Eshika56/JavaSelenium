package coreJava;

public class StringsEgs {

	public static void main(String[] args) {
		// Strings sequence of character stored
		// String methods equals, concatenation, substring, contains, replace, is empty, join, ends with, compare to, split
		String str1 = "Mumbai";
		String str2 = "Delhi";
		//equals
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		//concatenation
		System.out.println(str1.concat(str2));
		//contains
		System.out.println(str1.contains("z"));
		//substring
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(1, 3));
		//replace
		System.err.println(str1.replace("i", "g"));
		System.out.println(str1.replaceAll(str1, "Pune"));
		//is empty
		System.out.println(str1.isEmpty());
		//ends with
		System.out.println(str1.endsWith("e"));
		//join
			String str3 = String.join("_", "City", "Mumbai");
		System.out.println(str3);
		//compare to  lexo graphical comparison
		System.out.println(str2.compareTo(str3));
		//split
		String text = "Java is a programming language";
		String[] result = text.split(" ");
		for (String str : result) {
			System.out.println(str + ",");
		}

	}

}
