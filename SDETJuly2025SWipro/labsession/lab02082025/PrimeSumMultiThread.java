package multithreading;

 


	 class PrimeSumThread extends Thread {
	     int start, end;           // range for this thread
	     int sum = 0;              // sum of primes in this range

	     // used constructor to initialize the range
	     PrimeSumThread(int start, int end) {
	         this.start = start;
	         this.end = end;
	     }

	     // Check if a number is prime
	     boolean isPrime(int n) {
	         if (n <= 1) return false;
	         for (int i = 2; i <= Math.sqrt(n); i++)
	             if (n % i == 0) return false;
	         return true;
	     }

	     // run() method will be called when thread starts
	     public void run() {
	         for (int i = start; i <= end; i++) {
	             if (isPrime(i)) {
	                 sum += i; 
	             }
	         }
	     }
	 }

	 public class PrimeSumMultiThread {
	     public static void main(String[] args) throws InterruptedException {
	         //  two threads for range 1–50 and 51–100
	         PrimeSumThread t1 = new PrimeSumThread(1, 50);
	         PrimeSumThread t2 = new PrimeSumThread(51, 100);

	         // Start 
	         t1.start();
	         t2.start();

	         //  finish
	         t1.join();
	         t2.join();

	        
	         int totalSum = t1.sum + t2.sum;

	         
	         System.out.println("Sum of prime numbers from 1 to 100 = " + totalSum);
	     }
	 }

