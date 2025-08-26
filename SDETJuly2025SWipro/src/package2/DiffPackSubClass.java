package package2;
import package1.Class1;
public class DiffPackSubClass extends Class1 {
	public void create() {
		System.out.println("Creating in sub class");
	}
	

	public static void main(String[] args) {
		DiffPackSubClass obj = new DiffPackSubClass();
		obj.create(); // own method
		obj.display(); //inherited
		obj.employeeAddress();
	}

}
