package multithreading;
//Creating a class that extends the Thread class
public class HelloWorldThread extends Thread {
	// Basic Java thread program to print "Hello World!"

	
	
	    
	    // Overriding the run() method
	    public void run() {
	        // Code that will be executed when the thread runs
	        System.out.println("Hello World!");
	    }

	    // Main method to start the program
	    public static void main(String[] args) {
	        // Creating an instance of the thread
	        HelloWorldThread thread = new HelloWorldThread();

	        // Starting the thread - this will call the run() method
	        thread.start();
	    }
	}


