package coreJava;

public class RectangleShaping implements Shaping {
double length, width;
RectangleShaping(double length, double width) {
	this.length=length;
	this.width=width;
}
public double getArea() {
	return length*width;
}

	public static void main(String[] args) {
		RectangleShaping rs = new RectangleShaping(5, 3);
		System.out.println("Area of rectangle is: " + rs.getArea());
		

	}

}
