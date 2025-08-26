package coreJava;

public class IfElseLadder {

	public static void main(String[] args) {
		String branch = "Chickpet";
		if (branch == "Richmond Circle") {
			System.out.println("Deposit sceme is available");
		} else if (branch == "MG Road") {
			System.out.println("Retirement plan scheme is available");
		} else if (branch == "Majestic") {
			System.out.println("Insurance plan scheme is available");
		} else {
			System.out.println(branch);
		}

	}

}
