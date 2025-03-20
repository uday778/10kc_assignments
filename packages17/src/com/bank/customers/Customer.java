package com.bank.customers;

public class Customer {
	private String customerName;
	private int customerId;
	
	public void setCustomerName(String name) {
		this.customerName=name;
	}
	public void setCustomerId(int id) {
		this.customerId=id;
	}
	
	public void showCustomerDetails() {
		System.out.println("customerName : "+customerName);
		System.out.println("customerId: "+customerId);
	}
}
