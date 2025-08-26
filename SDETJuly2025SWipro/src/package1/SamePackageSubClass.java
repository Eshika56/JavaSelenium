package package1;

public class SamePackageSubClass extends Class1 {
	public void read() {
		System.out.println("Reading in sub class");
	}

	public static void main(String[] args) {
		SamePackageSubClass obj = new SamePackageSubClass();
		obj.display(); // inherited
		obj.read(); // own method
		obj.fetchemployeeId();
		obj.employeeAddress();
	}
}
