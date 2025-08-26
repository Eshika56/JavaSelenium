package multithreading;

class NewThreadEg extends Thread {
	// creating a thread using the thread class
			public void run() {
				System.out.println("Thread is running");
				
			}
class Test {
	public static void main(String[] args) {
					NewThreadEg t1 = new NewThreadEg();
					t1.start();
				}
			}
class Test1 {
	public static void main(String[] args) {
		NewThreadEg t1 = new NewThreadEg();
		t1.start();
	}
}

	public static void main(String[] args) {
		
		

	}
	
	

}
