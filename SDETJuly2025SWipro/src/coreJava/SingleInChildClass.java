package coreJava;

public class SingleInChildClass extends SingleInSuperClass {
String model = "Mustag";
public void display() {
	System.out.println("Brand is " + brand); // inherited
	System.out.println("Model is " + model);
}

	public static void main(String[] args) {
		SingleInChildClass obj = new SingleInChildClass();
		obj.start(); // inherited method
		obj.display(); // own method
		

	}

}
