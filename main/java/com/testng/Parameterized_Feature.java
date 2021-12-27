package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Feature {
	@Test
	@Parameters({"username","password"})
	private void demoParameter(@Optional("Tobey")String username,@Optional("spider@1")String password) {
		System.out.println("username : "+username);
		System.out.println("password : "+password);
	}

}
