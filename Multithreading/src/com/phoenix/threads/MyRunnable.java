package com.phoenix.threads;

import java.util.ArrayList;
import java.util.List;

public class MyRunnable implements Runnable {

	public void run()
	{
		System.out.println("Current thread: "+Thread.currentThread().getName());
		
		List<String> cities=new ArrayList<>();
		cities.add("mumbai");
		cities.add("Delhi");
		cities.add("Banglore");
		cities.forEach(System.out::println);
	}

}
