package college;
public class Student {
	private static String studentName;
	private static int studentId;
	private static String studentDepartment;
	public  Student(String name, int id, String department) {
		studentName = "Eshika Bose";
		studentId = 2904;
		studentDepartment = "Information Technology";
		
	}
	public void displayInfo() {
		System.out.println("Student Name:" + studentName);
		System.out.println("Student Id:" + studentId);
		System.out.println("Student Department:" + studentDepartment);
		
		
		
	}
	
		public static void main(String[] args) {
			Student obj = new Student("Eshika Bose", 2904, "Information Technology");
			obj.displayInfo();
		}
	}


