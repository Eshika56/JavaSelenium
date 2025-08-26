package io.ByteStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class FilterInputStreamEg {

	public static void main(String[] args) {
		// filter stream filter data as they read and write data in the input
		// filters it and pass out on to the underlying streams
		FileInputStream fis = null;
		FilterInputStream filterinput =  null;

	
try {
	// create file input stream for the file
	fis = new FileInputStream("C://Users//Eshika Bose//OneDrive//Documents//wipro 24.txt");
			// wrap file input stream with buffered input stream
			filterinput = new BufferedInputStream(fis);
	// read and print the file content
	int data;
	while ((data = filterinput.read()) != -1) {
		System.out.print((char)data);
	}
	fis.close();
} catch (Exception e) {
	System.out.println(e);
} } }
	
	

