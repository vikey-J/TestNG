package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreFeature {
	@Test(enabled = false)
	private void clashofclans() {
		System.out.println("clash Of Clans");
	}
	@Test
	private void pubg() {
		System.out.println("PUBG");
	}
	@Test
	private void whatsapp() {
		System.out.println("Whatsapp");
	}
	@Ignore
	@Test
	private void telegram() {
		System.out.println("Telegram");
	}
	@Test
	private void instagram() {
		System.out.println("Instagram");
	}

}
