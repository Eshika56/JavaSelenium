package io.CharStreams;

import java.io.File;
import java.io.FileInputStream;


public class FileToByteArray {
	
	    public static void main(String[] args) {
	        try {
	            
	            File file = new File("C://Users//Eshika Bose//OneDrive//Documents//File 1.txt");

	            // Create FileInputStream to read file
	            FileInputStream fis = new FileInputStream(file);

	            //  byte array of file size
	            byte[] byteArray = new byte[(int) file.length()];

	            
	            fis.read(byteArray);

	           
	            fis.close();

	            
	            System.out.println("File content in bytes:");
	            for (byte b : byteArray) {
	                System.out.print(b + " ");
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}


