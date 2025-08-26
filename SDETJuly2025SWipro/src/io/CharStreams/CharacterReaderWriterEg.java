package io.CharStreams;



	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class CharacterReaderWriterEg {

	    public static void main(String[] args) throws IOException {
	        // Writing characters to a file using FileWriter
	        FileWriter fw = new FileWriter("C://Users//Eshika Bose//OneDrive//Documents//AB4.txt");
	        fw.write("I am the character file writer");
	        fw.close(); // close the FileWriter

	        // Reading characters from the file using FileReader
	        FileReader fr = new FileReader("C://Users//Eshika Bose//OneDrive//Documents//AB4.txt");
	        int ch;
	        while ((ch = fr.read()) != -1) { // read() returns -1 at end of file
	            System.out.print((char) ch); // convert int to char before printing
	        }
	        fr.close(); // close the FileReader
	    }
	}


