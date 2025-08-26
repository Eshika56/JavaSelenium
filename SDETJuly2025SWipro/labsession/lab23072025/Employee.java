package coreJava;

class Emp {
	 public void work() {
		 System.out.println("Emp works");
	 }
	 public void getSalary() {
		 System.out.println("Emp gets salary");
	 }
 }
 class HRManager extends Emp  {
	 public void work() {
		 System.out.println("HRManager works");
	 }
	 public void addEmployee() {
		 System.out.println("Employee added");
	 }
 }
 class Employee {
	 public static void main(String[] args) {
		HRManager HM = new HRManager();
		HM.addEmployee();
		HM.work();
		HM.getSalary();

}
 }
