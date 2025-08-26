package coreJava;

abstract class VehicleEg {
	abstract void move();
}
	class Cars extends VehicleEg {
		void move() {
		System.out.println("Car is moving on four wheels");
		}
	}
	class Bike extends VehicleEg {
		void move() {
		System.out.println("Bike is moving on two wheels");
		}
	}
	class Bus extends VehicleEg {
		void move() {
		System.out.println("Bus is moving on six wheels");
		}
	}
		public class Vehicle1 {

	public static void main(String[] args) {
		Cars obj = new Cars();
		Bike obj1 = new Bike();
		Bus obj2 = new Bus();
		obj.move();
		obj1.move();
		obj2.move();
		
	}

}
