package multithreading;



//Define a thread class for printing even numbers
class EvenThread extends Thread {
 // Override the run method to define the task for this thread
 public void run() {
     // Loop through even numbers from 0 to 10
     for (int i = 0; i <= 10; i += 2) {
         // Print the even number
         System.out.println("Even: " + i);

         // Sleep for 500 milliseconds to simulate delay and allow interleaving
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             // Handle any interruption during sleep
             e.printStackTrace();
         }
     }
 }
}

//Define a thread class for printing odd numbers
class OddThread extends Thread {
 // Override the run() method to define the task for this thread
 public void run() {
     // Loop through odd numbers from 1 to 10
     for (int i = 1; i <= 10; i += 2) {
         // Print the odd number
         System.out.println("Odd: " + i);

         // Sleep for 500 milliseconds to simulate delay and allow interleaving
         try {
             Thread.sleep(500);
         } catch (InterruptedException e) {
             // Handle any interruption during sleep
             e.printStackTrace();
         }
     }
 }
}


public class EvenOddThreads {
 
 public static void main(String[] args) {
     // Create an instance of EvenThread
     EvenThread evenThread = new EvenThread();

     // Create an instance of OddThread
     OddThread oddThread = new OddThread();

     
     evenThread.start();

     
     oddThread.start();
 }
}
