package coreJava;

public class MethodOverloadingEg {
	//method add with 2 parameters
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	// method add with 3 parameters
	public int add(int a, int b, int c) {
		int d = a+b+c;
	    return d;
	}
	// method add with 4 parameters
	public int add(int a, int b, int c, int d) {
		int e = a+b+c+d;
		return e;
	}
	// different data types
	public double sum(int a, double b) {
		return(a+b);
	}

	public static void main(String[] args) {
		MethodOverloadingEg obj = new MethodOverloadingEg();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 2, 3));
		System.out.println(obj.add(1, 2, 3, 4));
		System.out.println(obj.sum(10, 20.5));

	}

}
