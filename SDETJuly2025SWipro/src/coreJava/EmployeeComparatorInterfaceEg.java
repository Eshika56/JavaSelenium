package coreJava;

public class EmployeeComparatorInterfaceEg {
	int id;
	String name;
	EmployeeComparatorInterfaceEg(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return id + "_" + name;
		
	}

	

}
