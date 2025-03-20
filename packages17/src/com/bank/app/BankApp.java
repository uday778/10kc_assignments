package com.bank.app;

import com.bank.accounts.BankAccount;
import com.bank.customers.Customer;

public class BankApp {
	public static void main(String[] args) {
		BankAccount bankAccount=new BankAccount();
		Customer customer=new Customer();
		
		bankAccount.setAccountNumber("123456");
		bankAccount.setBalance(12000000);
		customer.setCustomerId(21);
		customer.setCustomerName("uday kumar");
		
		bankAccount.showAccountDetails();
		customer.showCustomerDetails();
	}
	
	
    
}
