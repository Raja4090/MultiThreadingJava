package com.phoenix.threads;

import java.util.List;

public class ListThread2 extends Thread{

List<String> cities;
	
	public ListThread2()
	{
		
	}
	public ListThread2(List<String>cities)
	{
		super();
		this.cities=cities;
	}
	
	public void run()
	{
	   synchronized (cities) {
			
			  try {
				cities.set(1,"Tokyo");
				System.out.println(cities);
				Thread.sleep(1000);
			  }catch (Exception e) {
				// TODO: handle exception
			  }
			
		}
	}
	
}
