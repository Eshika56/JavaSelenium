package io.CharStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderEg {

	public static void main(String[] args) throws IOException {
		// reading and writing line by line buffered reader and writer is used
		BufferedWriter bw = new BufferedWriter (new FileWriter("C://Users//Eshika Bose//OneDrive//Documents//AB3.txt"));
				bw.write("I am the Buffered file writer");
		bw.close();
		// read the file
		BufferedReader br = new BufferedReader (new FileReader("C://Users//Eshika Bose//OneDrive//Documents//AB3.txt"));
				String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();

	}

}
