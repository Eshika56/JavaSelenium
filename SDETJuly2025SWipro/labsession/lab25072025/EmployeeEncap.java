package coreJava;

class Employees {
	
	    // Private fields
	    private String name;
	    private int id;
	    private double salary;

	    // Constructor to initialize name and id
	    public  Employees(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    // Setter for salary with validation
	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary; // Accept only positive salary
	        } else {
	            System.out.println("Invalid salary for " + name + ". Salary must be positive.");
	        }
	    }

	    // Method to display employee details
	    public void displayDetails() {
	    	 System.out.println("Employees Name: " + name);
	         System.out.println("Employees ID: " + id);
	         System.out.println("Employees Salary: ₹" + salary); 
	    }
	}

	// Main class to test the Employee class
	public class EmployeeEncap {
	    public static void main(String[] args) {
	        
	        Employees emp1 = new Employees("Raja", 100);
	        emp1.setSalary(80000);
	        emp1.displayDetails();

	        
	        Employees emp2 = new Employees("Rani", 101);
	        emp2.setSalary(-50000); 
	        emp2.displayDetails(); 

	        
	        Employees emp3 = new Employees("Ram", 102);
	        emp3.setSalary(25000); 
	        emp3.displayDetails();

	       
	        Employees emp4 = new Employees ("Riya", 103);
	        emp4.setSalary(0); 
	        emp4.displayDetails();
	    }
	}


