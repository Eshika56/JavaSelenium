package coreJava;


//Base class
class PaymentTest {
 public void pay() {
     System.out.println("Processing generic payment");
 }
}

//Child class 1
class CreditCard extends PaymentTest {
 public void pay() {
     System.out.println("Payment made using Credit Card.");
 }
}

//Child class 2
class UPI extends PaymentTest {
 public void pay() {
     System.out.println("Payment made using UPI.");
 }
}

//Child class 3
class NetBanking extends PaymentTest {
 public void pay() {
     System.out.println("Payment made using Net Banking.");
 }
}

//Main class to test
public class Payment {
 public static void main(String[] args) {
     PaymentTest p1 = new CreditCard();   
     PaymentTest p2 = new UPI();
     PaymentTest p3 = new NetBanking();

     p1.pay();  
     p2.pay();  
     p3.pay();  
 }
}
