package com.phoenix.threads.main;

import com.phoenix.models.Account;
import com.phoenix.threads.AccountThread;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc=new Account(12345,"Mr. and Mrs. Mehra ",10000.0f);
		
		Thread t1=new AccountThread(acc,3000.0f,true);
		Thread t2=new AccountThread(acc,3000.0f,true);
		
		t1.setName("Mr. mehra");
		t2.setName("Mrs. Mehra");
		t1.start();
		t2.start();
		
	}

}
