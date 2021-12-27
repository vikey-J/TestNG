package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class I_Retry {
	@Test(retryAnalyzer = Return.class)
	private void username() {

		String e="VIKEY";
		String a="Vikey";
		Assert.assertEquals(a, e);
	}
	@Test(retryAnalyzer = Return.class)
	private void password() {

		String e="VK@123";
		String a="vk@123";
		Assert.assertEquals(a, e);
	}

}
