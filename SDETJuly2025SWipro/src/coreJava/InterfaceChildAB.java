package coreJava;

public class InterfaceChildAB implements InterfaceA, InterfaceB {
	public void display() {
		System.out.println("Displaying in childAB class");
	}
	public static void main(String[] args) {
		InterfaceChildAB obj = new InterfaceChildAB();
		obj.display();
		InterfaceA aRef = obj;
		aRef.display();
		InterfaceB bRef = obj;
		bRef.display();
	}
}
