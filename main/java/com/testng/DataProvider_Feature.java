package com.testng;

import javax.xml.crypto.Data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Feature {
	@Test(dataProvider = "testdata")
	private void data(String a, int b) {
         System.out.println("a : "+a);
         System.out.println("b : "+b);
	}
	@DataProvider
	private Object[][]  testdata() {
		return new Object[][] {
			{"VK", 46},
			{"VKJ", 4}
			
			
			
		};
	}

}
