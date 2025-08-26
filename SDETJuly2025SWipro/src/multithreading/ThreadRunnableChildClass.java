package multithreading;

public class ThreadRunnableChildClass {

	public static void main(String[] args) {
		int n = 10; // number of threads
		for (int i = 0; i<n; i++) {
			Thread object = new Thread(new ThreadUsingRunnableInterface());
			object.start();
		}

	}

}
