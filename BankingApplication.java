// Simple Banking Application

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccount account = new BankAccount(99999, "Jim Smith", 5025.67);
		int choice;

		do {
			System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

				case 1: // Deposit
					System.out.print("Enter deposit amount: ");
					double deposit = sc.nextDouble();
					account.deposit(deposit);
					break;

				case 2: // Withdraw
					System.out.print("Enter withdrawal amount: ");
					double withdraw = sc.nextDouble();
					account.withdraw(withdraw);
					break;

				case 3: // Check Balance
					account.checkBalance();
					break;

				case 4: // Exit
					System.out.println("Thank you!")
					break;

				default:
					System.out.println("Invalid choice!");
			}
		} while (choice != 4):
		sc.close();
	}
}