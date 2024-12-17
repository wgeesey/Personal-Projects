// Bank Account class for use with Banking Application

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;

	// Constructor

	public BankAccount(int accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	// Deposit Method

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount + ", New Balance: " + balance);
		} else {
			System.out.println("Invalid amount!");
		}
	}

	// Withdrawal Method

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal amount: " + amount + ", New Balance: " + balance);
		} else {
			System.out.println("Insufficient funds or invalid amount!");
		}
	}

	// Check Balance
	public void checkBalance() {
		System.out.println("Current balance: " + balance);
	}
}