package coreJava;

class LibraryBook {
 private String title;
 private String author;
 private String isbn;
 private boolean isAvailable;

 // Constructor
 public LibraryBook(String title, String author, String isbn) {
     this.title = title;
     this.author = author;
     this.isbn = isbn;
     this.isAvailable = true; 
 }

 // Issue the book
 public void issueBook() {
     if (isAvailable) {
         isAvailable = false;
         System.out.println(title + " has been issued.");
     } else {
         System.out.println(title + " is already issued.");
     }
 }

 // Return the book
 public void returnBook() {
     if (!isAvailable) {
         isAvailable = true;
         System.out.println(title + " has been returned.");
     } else {
         System.out.println(title + " was not issued.");
     }
 }

 // Get book info
 public void getBookInfo() {
     System.out.println("Book: " + title);
     System.out.println("Author: " + author);
     System.out.println("ISBN: " + isbn);
     System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
     
 }
}

//Main class
public class LibraryTest {
 public static void main(String[] args) {
     // Create books objective
     LibraryBook b1 = new LibraryBook("Java", "James Gosling", "141518");
     LibraryBook b2 = new LibraryBook("Python", "Guido van Rossum", "132569");

  
     b1.getBookInfo();
     b2.getBookInfo();

     
     b1.issueBook(); 
     b1.issueBook();
     b2.issueBook();
     
     b1.returnBook();
     b2.returnBook(); 
     b1.returnBook();
    b2.returnBook();

     
 }
}

