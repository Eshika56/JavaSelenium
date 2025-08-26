package coreJava;

public class PrimeNumber {

    
    public static int checkPrime(int num) {
        if (num <= 1) return -1;

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return -1; // Not prime
        }

        return num; // Prime
    }

    public static void main(String[] args) {
        int number = 13; 
        int result = checkPrime(number);

        if (result != -1) {
            System.out.println(number + " is a prime number. Returned: " + result);
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}