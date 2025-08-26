package coreJava;

public interface Interface1 {
// abstract methods
	abstract void display();
	static void write() {
		System.out.println("Writing in interface");
	}
	default void show() {
		System.out.println("showing");
	}
	void read();
	public static final String employeename = "Jaya";
	int employeeId = 6767;
	
	}

