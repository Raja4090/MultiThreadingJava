package com.phoenix.models;

public class Account {

	private int accNo;
	private String ownerName;
	private float balance;
	
	public Account()
	{
		
	}

	public Account(int accNo, String ownerName, float balance) {
		super();
		this.accNo = accNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float currentBalance) {
		this.balance = currentBalance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	/*
	 * public void withdraw(float amount) throws InterruptedException {
	 * System.out.println("Hello");
	 * 
	 * synchronized (this) {
	 * 
	 * float currentBalance=getBalance();
	 * System.out.println("Before Withdraw: "+currentBalance+ "seen by "+
	 * Thread.currentThread().getName()); currentBalance-=amount;
	 * Thread.sleep(1000); setBalance(currentBalance);
	 * System.out.println("After withdraw: "+currentBalance+" seen by"
	 * +Thread.currentThread().getName()); } System.out.println("Bye");
	 * 
	 * }
	 *   
	 */
	
	public synchronized void withdraw(float amount) throws InterruptedException {
		  float currentBalance=getBalance();
		  System.out.println("Before Withdraw: "+currentBalance+ "seen by "+
		  Thread.currentThread().getName()); currentBalance-=amount;
		  Thread.sleep(1000); setBalance(currentBalance);
		  System.out.println("After withdraw: "+currentBalance+" seen by"
		  +Thread.currentThread().getName()); 
		  } 
}
