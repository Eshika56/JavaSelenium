package coreJava;


class Temperature {
	    private double celsius; // Private field for encapsulation

	    // Setter with validation: physical limit (-273.15°C is absolute zero)
	    public void setCelsius(double celsius) {
	        if (celsius >= -273.15) {
	            this.celsius = celsius;
	        } else {
	            System.out.println("Error: Temperature cannot be below absolute zero (-273.15°C)");
	        }
	    }

	    // Convert Celsius to Fahrenheit
	    public double toFahrenheit() {
	        return (celsius * 9/5) + 32;
	    }

	    // Convert Celsius to Kelvin
	    public double toKelvin() {
	        return celsius + 273.15;
	    }

	    // Display temperatures
	    public void displayTemperatures() {
	        System.out.println("Celsius: " + celsius + "°C");
	        System.out.println("Fahrenheit: " + toFahrenheit() + "°F");
	        System.out.println("Kelvin: " + toKelvin() + "K");
	    }
	}

	// Main class
	public class TempTest1 {
	    public static void main(String[] args) {
	        Temperature temp = new Temperature();
	        temp.setCelsius(35);
	        temp.displayTemperatures();

	        System.out.println();

	        temp.setCelsius(300); // valid
	        temp.displayTemperatures(); // Will still show last valid value
	    }
	}


