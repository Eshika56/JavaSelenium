package coreJava;

public class SingleDimArray {

	public static void main(String[] args) {
		// single dimensional array
		int a[] = new int [5];
		String [] names = {"Alice", "Peter", "Charlie"};
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		// for loop to print the elements of the array
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		// access single element
		System.out.println(a[1]);
		

	}

}
