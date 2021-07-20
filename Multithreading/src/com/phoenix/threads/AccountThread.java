package com.phoenix.threads;

import com.phoenix.models.Account;

public class AccountThread extends Thread{

	private Account account;
	private float amount;
	private boolean flag;
	
	public AccountThread()
	{
		
	}

	public AccountThread(Account account, float amount, boolean flag) {
		super();
		this.account = account;
		this.amount = amount;
		this.flag = flag;
	}
	
	public void run()
	{
		
			try {
				if(flag==true)
				account.withdraw(amount);
				else
					account.withdraw(amount);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
}
