package com.phoenix.threads;

import java.util.List;

public class ListThread1 extends Thread {
	
	List<String> cities;
	
	public ListThread1()
	{
		
	}
	public ListThread1(List<String>cities)
	{
		super();
		this.cities=cities;
	}
	
	public void run()
	{
		synchronized (cities) {
		
		try {
			cities.set(1,"Chennai");
			System.out.println(cities);
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		}
	}

}
