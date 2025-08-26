package coreJava;


public class TriangleShaping implements Shaping{
	    double base, height;

	    TriangleShaping(double base, double height) {
	        this.base = base;
	        this.height = height;
	    }

	    public double getArea() {
	        return 0.5 * base * height;
	    }


	public static void main(String[] args) {
		TriangleShaping ts = new TriangleShaping(3 ,4);
		System.out.println("Area of triangle is: " + ts.getArea());

	}

}
