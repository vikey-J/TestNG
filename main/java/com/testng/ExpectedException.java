package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedException {
	@Test(expectedExceptions = Exception.class)
	private void sample() {
		String a="abcd";
		String e="ABCD";
		Assert.assertEquals(a, e);
		
	
		
	}

}
