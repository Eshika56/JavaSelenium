package coreJava;

class Ani  {
	 public void makeSound() {
		System.out.println("Ani makes sound");
	}
 }
	 class Cat1 extends Ani {
		 public void bark() {
			System.out.println("Cat1 barks");
		}
	 }
	
 class Animal1 {
	 public static void main(String[] args) {
		 Cat1 ca = new Cat1();
		 
		 ca.bark();
	 }
 }
		
	
		

	



