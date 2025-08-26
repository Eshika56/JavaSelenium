package io.CharStreams;

import java.io.File;

public class ListFileInDirectory {
	

	    public static void main(String[] args) {

	
	        String directoryPath = "C://Users//Eshika Bose//OneDrive//Documents";  

	        // File object representing the directory
	        File directory = new File(directoryPath);

	        
	        if (directory.isDirectory()) {

	            
	            String[] fileList = directory.list();  // returns an array of file/directory names

	            System.out.println("Contents of directory: " + directoryPath);

	            // Loop through each file/directory name and print it
	            for (String name : fileList) {
	                System.out.println(name);
	            }

	        } else {
	            // If the path is not a directory, print an error message
	            System.out.println(directoryPath + " is not a valid directory.");
	        }
	    }
	}

