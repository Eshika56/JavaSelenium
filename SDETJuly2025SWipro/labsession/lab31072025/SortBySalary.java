package coreJava;


import java.util.*;


public class SortBySalary {

    class Employee {
        int id;            // Employee ID
        String name;       // Employee name
        double salary;     // Employee salary

        // Constructor to initialize employee object
        Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        // toString() method to print employee details
        public String toString() {
            return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
        }
    }

    
    public static void main(String[] args) {
        // Creating object of outer class to access inner class
        SortBySalary sb = new SortBySalary();

        // Creating a list of Employee objects
        List<Employee> employees = new ArrayList<>();

        // Adding employee objects to the list
        employees.add(sb.new Employee(101, "Ajay", 56000));
        employees.add(sb.new Employee(102, "Bibhu", 79000));
        employees.add(sb.new Employee(103, "Chirag", 45000));
        employees.add(sb.new Employee(104, "Diya", 61000));

        // Printing before sorting
        System.out.println("Before Sorting (Original Order):");
        for (Employee e : employees) {
            System.out.println(e);  // Calls toString() method
        }

        // Sorting by salary in descending order using Comparator
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                // Descending: compare second - first
                return Double.compare(e2.salary, e1.salary);
            }
        });

        // Printing after sorting
        System.out.println("\nAfter Sorting by Salary (Descending Order):");
        for (Employee e : employees) {
            System.out.println(e);  // Calls toString() method
        }
    }
}
