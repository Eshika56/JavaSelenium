package coreJava;
import java.util.*;
public class EmployeeComparableInterface implements Comparable<EmployeeComparableInterface> {
	int id;
	String name;
	// constructor of the class to pass the parameters
	public EmployeeComparableInterface(int id, String name) {
		this.id = id;
		this.name = name;
	}
	// implement CompareTo method for natural ordering (by id)
	public int compareTo(EmployeeComparableInterface s) {
		return this.id - s.id;
	}
	public String toString() {
		return id + "_" + name;
	}
// sort a list of students by Roll number (Ascending order)
	public static void main(String[] args) {
		List<EmployeeComparableInterface> EmployeeComparableInterface = new ArrayList<>();
		EmployeeComparableInterface.add(new EmployeeComparableInterface(101, "Ravi"));
		EmployeeComparableInterface.add(new EmployeeComparableInterface(102, "Priya"));
		EmployeeComparableInterface.add(new EmployeeComparableInterface(103, "Sweta"));
		Collections.sort(EmployeeComparableInterface);
		for (EmployeeComparableInterface s : EmployeeComparableInterface) {
			System.out.println(s);
		}
		Collections.sort(EmployeeComparableInterface);
			System.out.println("\nAfter Sorting by Name (Alphabetical Order):");
	        for (EmployeeComparableInterface s1 : EmployeeComparableInterface) {
	            System.out.println(s1);
	        }
	}
}
		

	

	
	



