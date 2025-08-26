package coreJava;

public class MaxOfThree {
    public static void main(String[] args) {
        
        System.out.print("Enter three numbers: ");
        int a = 22;
        int b = 45;
        int c = 14;

        if (a >= b && a >= c)
            System.out.println("Maximum is: " + a);
        else if (b >= a && b >= c)
            System.out.println("Maximum is: " + b);
        else
            System.out.println("Maximum is: " + c);
    }
    
}

