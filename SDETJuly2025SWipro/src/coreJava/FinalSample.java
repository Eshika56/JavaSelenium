package coreJava;

final class FinalSamples {
	    
	    final int codes = 4;

	     final void display() {
	        System.out.println("These finalsamples have " + codes + " codes.");
	    }
	}

	

	public class FinalSample {
	    public static void main(String[] args) {
	    	FinalSamples f = new FinalSamples();
	        f.display();
	    }
	}
