package coreJava;


abstract class Student {
	abstract String getGrade();
}

class EngineeringStudent extends Student {
	String name;
	int rollNo;
	int marks;
	EngineeringStudent(String name, int rollNo, int marks) {
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	String getGrade() {
		
		if (marks>=80) return ("Grade A");
		else if (marks>=60) return ("Grade B");
		else if (marks>=50) return ("Grade C");
		else return ("Grade fail");
		}
	}
		
	

class MedicalStudent extends Student {
	String name;
	int rollNo;
	int marks;
	MedicalStudent(String name, int rollNo, int marks) {
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	String getGrade() {
		
		if (marks>=90) return ("Grade A");
		else if (marks>=70) return ("Grade B");
		else if (marks>=60) return ("Grade C");
		else return ("Grade fail");
		}
	}
		
	
	
	
	
	
	public class Student1 {
	public static void main(String[] args) {
		EngineeringStudent obj = new EngineeringStudent("Priti", 101, 78);
		System.out.println("Engineering Student: " + obj.name);
		System.out.println("Roll no: " + obj.rollNo);
		System.out.println("Grade: " + obj.getGrade());
		
		MedicalStudent obj1 = new MedicalStudent("Ayush", 102, 82);
		System.out.println("Medical Student: " + obj1.name);
		System.out.println("Roll no: " + obj1.rollNo);
		System.out.println("Grade: " + obj1.getGrade());
		
		

	}

}
