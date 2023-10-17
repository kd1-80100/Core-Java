package com.sunbeam;

/*
 (Credit Limit Calculator)
Develop a Java application that determines whether any of several department-store customers has
exceeded the credit limit on a charge account.
For each customer,the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning
balance+ charges – credits), display the new balance and determine whether the new balance
exceeds the customer’s credit limit. For those customers whose credit limit is exceeded, the
program should display the message "Credit limit exceeded".	 
 */
import java.util.Scanner;

public class NewBalance {
	int accNum; // account number
	int initBal; // balance at the beginning of the month
	int nCharged; // total of all items charged by the customer this month
	int nCredits; // total of all credits applied to the customer’s account this month
	int cLimit; // allowed credit limit

	public NewBalance() {
		this.accNum = 0;
		this.initBal = 0;
		this.nCharged = 0;
		this.nCredits = 0;
		this.cLimit = 0;
	}

	public NewBalance(int accNum, int initBal, int nCharged, int nCredits, int cLimit) {
		super();
		this.accNum = accNum;
		this.initBal = initBal;
		this.nCharged = nCharged;
		this.nCredits = nCredits;
		this.cLimit = cLimit;
	}

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public int getInitBal() {
		return initBal;
	}

	public void setInitBal(int initBal) {
		this.initBal = initBal;
	}

	public int getnCharged() {
		return nCharged;
	}

	public void setnCharged(int nCharged) {
		this.nCharged = nCharged;
	}

	public int getnCredits() {
		return nCredits;
	}

	public void setnCredits(int nCredits) {
		this.nCredits = nCredits;
	}

	public int getcLimit() {
		return cLimit;
	}

	public void setcLimit(int cLimit) {
		this.cLimit = cLimit;
	}

	public void acceptData() { // Accept details
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the account number:");
		accNum = sc.nextInt();
		System.out.print("Enter the intial balance:");
		initBal = sc.nextInt();
		System.out.print("Enter the total number of items charged:");
		nCharged = sc.nextInt();
		System.out.print("Enter the credits applied to the customer’s account:");
		nCredits = sc.nextInt();
		System.out.print("Enter the credit limit:");
		cLimit = sc.nextInt();
		sc.close();
	}

	public void displayData() { // Display details
		System.out.println("Account number:" + accNum);
		System.out.println("Intial balance:" + initBal);
		System.out.println("Number of items charged:" + nCharged);
		System.out.println("Credits applied to customer’s account:" + nCredits);
		System.out.println("Credit limit:" + nCredits);
	}

	public void calculateBalance() {
		/* calculate new balance and determine whether the new balance exceeds the
		 customer’s credit limit.*/

		int newBalance = initBal + nCharged - nCredits;
		System.out.println("New balance:" + newBalance);
		if (newBalance > cLimit) {
			System.out.println("Credit limit exceeded.");
		} else {
			System.out.println("Thank you..");
		}
	}
}