package coreJava;

abstract public class AbstractClassEg {
	// abstract method - no body
	abstract void makesound();
	// concrete method
	public void eat() {
		System.out.println("The animal eats food");
	}
	// constructor
	AbstractClassEg() {
	System.out.println("Creating constructor in abstract class");
	

}
	// instance variable
	public static String animalName = "Lion";
	// final variable
	private final String animalBehaviour = "roars";

	
	
}


