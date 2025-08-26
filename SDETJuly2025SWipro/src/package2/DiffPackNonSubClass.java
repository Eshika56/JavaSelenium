package package2;

import package1.Class1;

public class DiffPackNonSubClass {
	public void print() {
		System.out.println("Printing the data");
	}

	public static void main(String[] args) {
		Class1 obj = new Class1();
		DiffPackNonSubClass obj1 = new DiffPackNonSubClass();
		obj.display();
obj1.print();

	}

}
