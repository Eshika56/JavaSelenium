package io.ByteStreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamEg {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		FilterOutputStream filterOut = null;
		try {
			// create file output stream to write to the file
			fos = new FileOutputStream ("C://Users//Eshika Bose//OneDrive//Documents//AB1.txt");
			// wrap file input stream with buffered input stream
			filterOut = new BufferedOutputStream(fos);
			// write the data to the file
			String text = "Hi who are you";
			filterOut.write(text.getBytes());
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			filterOut.close();
			fos.close();
		}

	}

}
