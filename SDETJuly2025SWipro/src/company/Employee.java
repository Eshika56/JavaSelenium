package company;

import college.Student;

public class Employee {
	public String employeeName;
	public int employeeId;
	public String employeeDepartment;
	public Employee(String name, int id, String department) {
		employeeName = "Raha Roy";
		employeeId = 2125;
		employeeDepartment = "Web Developer";
		
	}
	public void display() {
		System.out.println("Employee Name:" + employeeName);
		System.out.println("Employee Id:" + employeeId);
		System.out.println("Employee Department:" + employeeDepartment);
		
		
		
	}
	
		public static void main(String[] args) {
			Employee obj1 = new Employee("Raha Roy", 2125, "Web Developer");
			Student obj = new Student("Eshika Bose", 2904, "Information Technology");
			obj1.display();
			obj.displayInfo();
			
		}
	}



	


