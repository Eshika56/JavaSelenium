package customer;
public class Customer {
	protected String customerName;
	protected int customerId;
	protected String customerDepartment;
	public Customer(String name, int id, String department) {
		customerName = name;
		customerId = id;
		customerDepartment = department;
		
	}
	public void displayCon() {
		System.out.println("Customer Name:" + customerName);
		System.out.println("Customer Id:" + customerId);
		System.out.println("Customer Department:" + customerDepartment);
		
		
		
	}
	
		public static void main(String[] args) {
			Customer obj2 = new Customer("Ashish Dubey", 2326, "designing");
			Customer obj = new Customer("Eshika Bose", 2904, "Information Technology");
			Customer obj1 = new Customer("Raha Roy", 2125, "Web Developer");
			obj2.displayCon();
			obj.displayCon();
			obj1.displayCon();
			
		}
	}



	


