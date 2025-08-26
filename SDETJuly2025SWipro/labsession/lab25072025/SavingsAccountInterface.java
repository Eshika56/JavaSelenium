package coreJava;
public class SavingsAccountInterface implements AccountInterface {
	double balance;
	double interestRate;
	
	SavingsAccountInterface (double balance, double interestRate) {
		this.balance=balance;
		this.interestRate=interestRate;
		
	}
	// Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " in Savings Account");
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " from Savings Account");
        } else {
            System.out.println("Insufficient funds in Savings Account");
        }
    }

    // Calculate interest and add to balance
    public void calculateInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest rate of ₹" + interest + " added to Savings Account");
    }

    // View current balance
    public void viewBalance() {
        System.out.println("Savings Account Balance: ₹" + balance);
    }

    // Unique method for SavingsAccount
    public void savingsFeature() {
        System.out.println("This account earns interest monthly.");
    }

	public static void main(String[] args) {
		SavingsAccountInterface sa = new SavingsAccountInterface(1000, 5); 
        sa.deposit(500);
        sa.calculateInterest();
        sa.withdraw(300);
        sa.savingsFeature();
        sa.viewBalance();

	}

}
