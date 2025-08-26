package coreJava;

// Parent class
class MultiInCars {
    String brand = "BMW";
    String model = "M5";

    public void showModel() {
        System.out.println("Car model: " + model);
    }
}

// Child class
public class MultiInSportsCar extends MultiInCars {
    int topSpeed = 250;

    public void display() {
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: " + model);
        System.out.println("Top speed is: " + topSpeed);
    }

    public static void main(String[] args) {
        MultiInSportsCar obj = new MultiInSportsCar();
        obj.showModel();   // From parent class
        obj.display();     // From child class
    }
}
