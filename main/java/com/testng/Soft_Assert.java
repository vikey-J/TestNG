package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	@Test
	private void uername() {
		String actual="VK46";
		String expected="vK46";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, expected);
		System.out.println("Verify successfull");
	}

}
