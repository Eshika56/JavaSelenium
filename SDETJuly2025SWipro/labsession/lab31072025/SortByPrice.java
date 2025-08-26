package coreJava;
import java.util.*;
public class SortByPrice {
	


	class Product {
	    int id;
	    String name;
	    double price;

	    // Constructor to initialize Product fields
	    Product(int id, String name, double price) {
	        this.id = id;
	        this.name = name;
	        this.price = price;
	    }

	    // Overriding toString method for easy display
	    public String toString() {
	        return "ID: " + id + ", Name: " + name + ", Price: " + price;
	    }
	}

	

	    public static void main(String[] args) {
	    	SortByPrice sb = new SortByPrice();
	        // Creating a list of products
	        List<Product> products = new ArrayList<>();

	        // Adding products to the list
	        products.add(sb.new Product(1, "Mouse", 200));
	        products.add(sb.new Product(2, "Keyboard", 400));
	        products.add(sb.new Product(3, "Laptop", 12000));
	        products.add(sb.new Product(4, "Speaker", 500)); // Same price as Mouse
	        products.add(sb.new Product(5, "Adapter", 600)); // Same price as Mouse and Speaker

	        // Sorting using Comparator with multiple fields
	        Collections.sort(products, new Comparator<Product>() {
	            public int compare(Product p1, Product p2) {
	                // First sort by price
	                if (p1.price != p2.price) {
	                    return Double.compare(p1.price, p2.price); // Ascending order of price
	                } else {
	                    return p1.name.compareTo(p2.name); // If price same, sort by name
	                }
	            }
	        });

	        // Displaying sorted product list
	        System.out.println("Sorted Products by Price and then Name:");
	        for (Product p : products) {
	            System.out.println(p); // toString method is called implicitly
	        }
	    }
	}


