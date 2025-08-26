package coreJava;

// abstract class
abstract class Area {
    // abstract method
    abstract double getArea();
}

// subclass Circle
class Circles extends Area {  // inherits from Shape abstract class
    double radius; // instance variable

    Circles(double radius) { // constructor
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius; // area of the circle
    }
}

// subclass Rectangle
class Rectangle extends Area {  // inherits from Shape abstract class
    double length, width; // instance variables

    Rectangle(double length, double width) { // constructor
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width; // area of the rectangle
    }
}

// main class
public class Shaped {
    public static void main(String[] args) {
        Circles obj = new Circles(5);
        Rectangle obj1 = new Rectangle(4, 6);

        System.out.println("Area of the circle is " + obj.getArea());
        System.out.println("Area of the rectangle is " + obj1.getArea());
    }
}
