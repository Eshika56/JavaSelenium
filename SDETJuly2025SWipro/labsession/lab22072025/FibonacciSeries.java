package coreJava;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the number of terms for Fibonacci Series:");
		int n = 9;
		int first = 0, second = 1;
		System.out.println("Fibonacci serires up to" + n + "terms:");
		for (int i = 1; i<=n; i++) {
			System.out.println(first + " ");
			int followed = first + second;
			first = second;
			second = followed;
			
		}

	}

}
