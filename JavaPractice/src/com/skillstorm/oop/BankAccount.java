package com.skillstorm.oop;

/**
 * 4 Pillars of OOP
 * 
 * Inheritance
 * Encapsulation
 * Abstraction
 * Polymorphism
 * 
 * @author Sean Carter
 *
 */
public class BankAccount {
	
	private String holder;
	private double balance;
	private final String accountNumber; // READ ONLY
	private final String routingNumber; // READ ONLY
	
	public BankAccount(String holder, double balance, String accountNumber, String routingNumber) {
		this.holder = holder;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.routingNumber = routingNumber;
	}

	// access-modifier return-type functionName(params...) {}
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		// insert validation logic here
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getRoutingNumber() {
		return routingNumber;
	}
	
	// NO SETTER because it's read ONLY
//	public void setAccountNumber(String accountNumber) {
//		this.accountNumber = accountNumber;
//	}
}
