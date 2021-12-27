package com.testng;

import org.testng.annotations.Test;

public class InnovacationCount {
	@Test(priority = 0)
	private void openChrome() {
		System.out.println("Chrome open");
	}

	@Test(priority = 1)
	private void url() {
		System.out.println("URL entered");
	}

	@Test(priority = 2,invocationCount = 3)
	private void refresh() {
		System.out.println("Home Page Refresh");
	}

}
