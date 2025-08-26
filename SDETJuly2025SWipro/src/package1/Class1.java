package package1;

public class Class1 {
	private static String employeeSalary = "55802";
	private void fetchsalary() {
		System.out.println("The employee salay is " + employeeSalary);
	}
	public void display() {
		System.out.println("Displaying the data in the parent class");
	}
	// default variable
	int employeeId = 554;
	// default method
	void fetchemployeeId() {
		System.out.println("The employee id is " + employeeId);
	}
// protected variable
	protected void employeeAddress() {
		System.out.println("The employee address is Blr");
	}
	
	
	public static void main(String[] args) {
		Class1 obj = new Class1();
		obj.display();
		obj.fetchsalary();
obj.fetchemployeeId();
obj.employeeAddress();
	}

}
