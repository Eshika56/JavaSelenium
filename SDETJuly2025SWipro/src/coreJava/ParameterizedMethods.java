package coreJava;

public class ParameterizedMethods {
	// normal method with hard coded data
	public void add () {
		int a = 7;
		int b = 8;
			int c = a+b;
		System.out.println(c);
	}
	// method with parameters
	public void add1(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	// method returning a int value
	public int add2(int a, int b) {
		int c = a+b;
		return c;
	}
	public static void main(String[] args) {
		ParameterizedMethods pm = new ParameterizedMethods();
		pm.add1(7, 8);
		pm.add1(8, 4);
		pm.add1(-9, -3);
		pm.add1(1, -0);
		
		System.out.println(pm.add2(2, 4));
		
	}
}