package coreJava;

public class CurrentAccountInterface implements AccountInterface {
	double balance;
	double overdraftLimits;
	
	CurrentAccountInterface (double balance, double overdraftLimits) {
		this.balance=balance;
		this.overdraftLimits=overdraftLimits;
		
	}
	// Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " in Current Account");
    }

    // Withdraw method with overdraft check
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimits) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Current Account");
        } else {
            System.out.println("Exceeded overdraft limit in Current Account");
        }
    }

    // No interest for current account
    public void calculateInterest() {
        System.out.println("No interest for Current Account");
    }

    // View balance
    public void viewBalance() {
        System.out.println("Current Account Balance: ₹" + balance);
    }

    // Unique method for CurrentAccount
    public void currentFeature() {
        System.out.println("This account allows overdraft up to ₹" + overdraftLimits);
    }


	public static void main(String[] args) {
		CurrentAccountInterface ca = new CurrentAccountInterface(1000, 2000); 
        ca.deposit(700);
        ca.calculateInterest();
        ca.withdraw(500);
        ca.currentFeature();
        ca.viewBalance();

	}

}
