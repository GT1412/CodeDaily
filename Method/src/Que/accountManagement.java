package Que;

import java.util.Scanner;

public class accountManagement {

	String name, AcNumber, MobileNo;
	float deposit, withdraw, totalBalance;

	int choice;

	Scanner sc = new Scanner(System.in);

	void input() {
		System.out.println("Enter the Details of Customer ");

		System.out.println("Enter the name of Customer ");
		name = sc.next();

		System.out.println("Enter the Account Number ");
		AcNumber = sc.next();

		System.out.println("Enter the Mobile Number ");
		MobileNo = sc.next();

		System.out.println("Enter the TotalBalance");
		totalBalance = sc.nextInt();
		do {
			System.out.println(" Enter the option What do you Want ? ");
			System.out.println("1. Deposite 2.Withdraw 3.Balance 4.Account Display 5.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				deposit();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				balance();
				break;
			case 4:
				display();
				break;
			case 5:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("Please Enter the Valid Option ");

			}
		} while (choice !=5);
	}

	void display() {
		System.out.println("Details of Customer : ");
		System.out.println("Name : " + name);
		System.out.println("Account Number  : " + AcNumber);
		System.out.println("Mobile Number : " + MobileNo);
		System.out.println("Total Balance : " + totalBalance);

	}

	void deposit() {
		System.out.println("Enter the Amount You Want To Deposit");
		deposit = sc.nextFloat();
		totalBalance = totalBalance + deposit;
		System.out.println("Total Balance is  :" + totalBalance);
	}

	void withdraw() {
		System.out.println("Enter the Amount You Want to Withdraw");
		withdraw = sc.nextFloat();
		totalBalance = totalBalance - withdraw;
		System.out.println("Total Balace is : " + totalBalance);

	}

	void balance() {
		System.out.println("Total Balance is : " + totalBalance);
	}
}
