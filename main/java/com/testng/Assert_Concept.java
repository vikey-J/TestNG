package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {
	@Test
	private void username() {
		String expected = "Andrew";
		String actual="andrew";
		Assert.assertNotEquals(actual, expected);
//		System.exit(0);
		System.out.println("Username Validation Successfully");
	}
	@Test
	private void password() {
		String actual="Amazing@spd";
		String expected="amazing@spd";
		Assert.assertNotEquals(actual, expected);
		System.out.println("Password validation successfully");
	}
}
