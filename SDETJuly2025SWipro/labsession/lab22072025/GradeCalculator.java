package coreJava;

 
public class GradeCalculator {

    public static void main(String[] args) {
        int marks = 85; // You can change this value to test different marks

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks <= 89) {
            System.out.println("Grade: B");
        } else if (marks >= 60 && marks <= 74) {
            System.out.println("Grade: C");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 40) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid marks entered.");
        }
    }
}


