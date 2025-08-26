package coreJava;
import java.util.*;
public class ComparableInterface1Eg implements Comparable<ComparableInterface1Eg> {
	int rollNumber;
	String name;
	// constructor of the class to pass the parameters
	public ComparableInterface1Eg(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	// implement CompareTo method for natural ordering (by roll number)
	public int compareTo(ComparableInterface1Eg s) {
		return this.rollNumber - s.rollNumber;
	}
	public String toString() {
		return rollNumber + "_" + name;
	}
// sort a list of students by Roll number (Ascending order)
	public static void main(String[] args) {
		List<ComparableInterface1Eg> ComparableInterface1Eg = new ArrayList<>();
		ComparableInterface1Eg.add(new ComparableInterface1Eg(101, "Ravi"));
		ComparableInterface1Eg.add(new ComparableInterface1Eg(102, "Riya"));
		ComparableInterface1Eg.add(new ComparableInterface1Eg(103, "Ron"));
		Collections.sort(ComparableInterface1Eg);
		for (ComparableInterface1Eg s : ComparableInterface1Eg) {
			System.out.println(s);
		}

	}

	
	
}


