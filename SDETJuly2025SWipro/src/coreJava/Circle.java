package coreJava;


public class Circle implements CircleShape {
	// method coming from interface shapes 
	public void draw()  {
		System.out.println("Drawing circle");
	}
	// method coming from CircleShapes
	public void radius() {
		System.out.println("Radius is 5 units");
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		c.radius();
	
		{
	}
}

}
