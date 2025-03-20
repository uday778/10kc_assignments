package com.bank.accounts;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public void setAccountNumber(String accNum) {
		this.accountNumber=accNum;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public dounle getBalance() {
		return balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void showAccountDetails() {
		System.out.println("accountNumber : "+accountNumber);
		System.out.println("balance : "+balance);
	}
	

}
