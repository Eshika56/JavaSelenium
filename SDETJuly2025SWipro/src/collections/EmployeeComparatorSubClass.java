package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparatorSubClass implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name); // ascending order
		
	}

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee (103, "Ravi"));
		employees.add(new Employee (101, "Amit"));
		employees.add(new Employee (102, "Zara"));
        Collections.sort(employees, new EmployeeComparatorSubClass());
        for (Employee e : employees) {
        	System.out.println(e);

	}

}}
