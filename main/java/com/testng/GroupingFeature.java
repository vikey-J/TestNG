package com.testng;

import org.testng.annotations.Test;

public class GroupingFeature {
	@Test(groups = "Games",priority = -1)
	private void pubg() {
		System.out.println("PUBG");
	}

	@Test(groups = "Social Media")
	private void whatsapp() {
		System.out.println("Whatsapp");
	}

	@Test(groups = "Music")
	private void wynkMusic() {
		System.out.println("WynkMusic");
	}

	@Test(groups = "Games",priority = 0)
	private void coc() {
		System.out.println("Clash Of Clans");
	}

	@Test(groups = "Music")
	private void spotify() {
		System.out.println("Spotify");
	}

	@Test(groups = "Social Media")
	private void facebook() {
		System.out.println("FaceBook");
	}

	@Test(groups = "Games")
	private void gtaViceCity() {
		System.out.println("GTA Vice City");
	}

	@Test(groups = "Social Media")
	private void instagram() {
		System.out.println("Instagram");
	}
}
