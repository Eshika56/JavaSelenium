package multithreading;

public class ThreadSync {
	private int c = 0; // shared variable
	// sync method to increment counter
	public synchronized void inc() {
		c++;
	}
	// sync method to get the counter value
	public synchronized int get() {
		return c;
	}

	

}
