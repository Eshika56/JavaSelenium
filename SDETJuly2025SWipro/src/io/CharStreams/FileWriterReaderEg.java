package io.CharStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderEg {

	public static void main(String[] args) throws IOException {
		// write to file using file writer
		FileWriter fw = new FileWriter("C://Users//Eshika Bose//OneDrive//Documents//AB2.txt");
		fw.write("I am the file writer");
		fw.close();
		// reading from file using file reader
		FileReader fr = new FileReader("C://Users//Eshika Bose//OneDrive//Documents//AB2.txt");
		int i;
		while ((i = fr.read()) != - 1) {
			System.out.print((char)i);
		}
		fr.close();
	}

}
