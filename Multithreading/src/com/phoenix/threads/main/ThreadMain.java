package com.phoenix.threads.main;

import com.phoenix.threads.MyThread;
//raja.kumar@stltech.in
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current thread: "+Thread.currentThread().getName());
		
		Thread t1=new MyThread();
		Thread t2=new MyThread();
		t1.setName("Rahul");
		t2.setName("Komal");
		t1.setPriority(2);
		t2.setPriority(8);
		t1.start();
		t2.start();
	}

}
