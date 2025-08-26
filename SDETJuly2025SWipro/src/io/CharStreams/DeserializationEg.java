package io.CharStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEg {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// create the stream and read the object
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("C://Users//Eshika Bose//OneDrive//Documents//File 1.txt"));
		Student s = (Student)in.readObject();
		// printing the object details
		System.out.println(s.id + " " + s.name);
		in.close();

	}

}
