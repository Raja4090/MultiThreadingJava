package com.phoenix.threads;

import java.util.Scanner;

public class DataRecieverThread extends Thread {

	int arr[];

	public DataRecieverThread(int[] arr) {
		super();
		this.arr = arr;
	}
	
	public void run()
	{
	  synchronized (arr) {

		Scanner s=new Scanner(System.in);
		
		for(int r=0;r<arr.length;r++)
		{
			System.out.print("Enter data:");
			int data=s.nextInt();
			arr[r]=data;
		}
		arr.notify();
	  }
	}
	
}
