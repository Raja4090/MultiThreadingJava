package com.phoenix.threads;
//raja.kumar@stltech.in
public class MyThread extends Thread {

	public void run()
	{
		try {
			for(int r=0;r<5;r++)
		    {
			   
				System.out.println(r);
			    //System.out.println("Current thread: "+Thread.currentThread().getName());
			    System.out.println("Current thread: "+Thread.currentThread());
				
			    Thread.sleep(1000);
		    }
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}

}
