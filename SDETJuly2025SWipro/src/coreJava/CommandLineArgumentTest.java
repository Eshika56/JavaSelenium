package coreJava;

public class CommandLineArgumentTest {

	public static void main(String[] args) {
	
		
		 // check number of entered parameters.
        if (args.length > 0) {
            // print all entered values.
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument at " + i + " Position: " + args[i]);
            }
        }
    }


	}


