package coreJava;



public class MultiplicationTable {
    public static void main(String[] args) {
        

        // Input: Enter the number
        System.out.print("Enter a number to print its multiplication table: ");
        

        // Using for loop to print the table
        int num = 2;
        System.out.println("Multiplication Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        
    
}
}
