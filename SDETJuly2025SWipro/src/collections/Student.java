package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	int rollNumber;
	String name;
	// constructor of the class to pass the parameters
	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	// implement CompareTo method for natural ordering (by roll number)
	public int compareTo(Student s) {
		return this.rollNumber - s.rollNumber;
	}
	public String toString() {
		return rollNumber + "_" + name;
	}
// sort a list of students by roll number (ascending order)
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student (103, "Ravi"));
		students.add(new Student (101, "Amit"));
		students.add(new Student (102, "Zara"));
        Collections.sort(students);
        for (Student s : students) {
        	System.out.println(s);
        }
	}

}
