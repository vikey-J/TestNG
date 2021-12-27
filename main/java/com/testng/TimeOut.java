package com.testng;

import org.testng.annotations.Test;

public class TimeOut {
	@Test(timeOut = 6000)
	private void sample() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		Thread.sleep(2000);
		System.out.println("URL Launch");
		Thread.sleep(2000);
		System.out.println("Home Page View");
		
		System.out.println("click webelement");
	}

}
