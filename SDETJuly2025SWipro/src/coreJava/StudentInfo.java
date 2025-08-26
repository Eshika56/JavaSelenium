package coreJava;

public class StudentInfo {

	
	    // Method to display student information
	    public static void displayStudentInfo(String name, int rollNumber, String course) {
	        System.out.println("Student Information:");
	        System.out.println("Name: " + name);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Course: " + course);
	    }

	    // Main method to call the display method
	    public static void main(String[] args) {
	        // Example student data
	        String studentName = "Eshika Bose";
	        int studentRoll = 38;
	        String studentCourse = "B.Tech Information Technology";

	        // Call method to display student info
	        displayStudentInfo(studentName, studentRoll, studentCourse);
	    }
	

	}


