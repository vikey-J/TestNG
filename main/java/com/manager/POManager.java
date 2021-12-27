package com.manager;

import org.openqa.selenium.WebDriver;

import pom2.BookHotel;
import pom2.Final;
import pom2.HomePage;
import pom2.SearchHotel;
import pom2.SelectHotel;

public class POManager{
	public WebDriver driver;
	private HomePage hp;
	private SearchHotel s;
	private SelectHotel sh;
	private BookHotel bh;
	private Final f;
	public POManager(WebDriver driver2) {
    this.driver=driver2;
    }
	public HomePage getHp() {
		if(hp==null) {
			hp=new HomePage(driver);
		}
		return hp;
	}
	public SearchHotel getS() {
		if(s==null) {
			s=new SearchHotel(driver);
		}return s;
	}
	public SelectHotel getSh() {
		if(sh==null) {
			sh=new SelectHotel(driver);
		}return sh;
	}
	public BookHotel getBh() {
		if(bh==null) {
			bh=new BookHotel(driver);
		}return bh;
	}
	public Final getF() {
		if(f==null) {
			f=new Final(driver);
		}return f;
	}
}