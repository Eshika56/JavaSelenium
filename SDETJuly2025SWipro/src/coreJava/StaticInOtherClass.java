package coreJava;

public class StaticInOtherClass {

	public static void main(String[] args) {
		System.out.println(StaticVariables.studentName);
		System.out.println(StaticVariables.studid);
		StaticVariables sv = new StaticVariables();
		System.out.println(sv.college);

	}

}
