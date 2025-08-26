package io.CharStreams;



	import java.io.StringReader;
	import java.io.StringWriter;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;

	public class StringWriterReaderEg {

	    public static void main(String[] args) throws IOException {
	        // Create a StringWriter to write string data
	        StringWriter sw = new StringWriter();
	        BufferedWriter bw = new BufferedWriter(sw);
	        bw.write("I am the Buffered StringWriter.");
	        bw.close(); // Important to flush the content to the StringWriter

	        // Get the written string
	        String writtenData = sw.toString();

	        // Now read from the string using StringReader
	        StringReader sr = new StringReader(writtenData);
	        BufferedReader br = new BufferedReader(sr);
	        String line;

	        // Read and print each line
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }

	        br.close(); // Close the reader
	    }
	}


