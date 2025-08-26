package coreJava;

 
public class SimpleArraySearch {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; 
        int key = 20; 

        

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                
              
            }
        }

        
                    }
    }

