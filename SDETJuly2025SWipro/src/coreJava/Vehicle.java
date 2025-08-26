package coreJava;

class Vehi  {
	 public void drive() {
		System.out.println("Vehi is driving");
	}
 }
	 class Car extends Vehi {
		 public void repair() {
			System.out.println("Repairing a car");
		}
	 }
	
 class Vehicle {
	 public static void main(String[] args) {
		 Car c = new Car();
		 
		 c.repair();
	 }
 }
		
	
		

	



