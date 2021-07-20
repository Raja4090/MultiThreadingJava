package com.phoenix.threads;

import java.util.Scanner;

public class DataPrinterThread extends Thread {
	
	int arr[];

	public DataPrinterThread(int[] arr) {
		super();
		this.arr = arr;
	}
	
	public void run()
	{
    try {
	  synchronized (arr) {
 
		  System.out.println("Waiting for printing.....");
		 
			arr.wait(10);
			for(int ele:arr)
			{
				System.out.println(ele);
				Thread.sleep(500);
			}
			
		}
     }
    catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	}