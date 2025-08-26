package io.ByteStreams;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamEg {

	public static void main(String[] args) {
		
				String data = "I am attending the java training class";
				try {
					// create an output stream
					ByteArrayOutputStream output = new ByteArrayOutputStream();
					byte[] array = data.getBytes();
					// writes data to the output stream
					output.write(array);
					// retrieves data from the output stream in string format
					String streamData = output.toString();
					System.out.println("Output stream: " + streamData);
					output.close();
					
				} catch (Exception e) {
					System.out.println(e);
				}

			}

		


	}


