package coreJava;

public class CircleShaping implements Shaping {
double radius;
CircleShaping(double radius) {
	this.radius=radius;
}
public double getArea() {
	return Math.PI*radius*radius;
}

	public static void main(String[] args) {
		CircleShaping cs = new CircleShaping(5);
		System.out.println("Area of circle is: " + cs.getArea());
		

	}

}
