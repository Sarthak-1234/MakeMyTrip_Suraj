package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import initiateDriver.initClass;

public class MakeMyTripHomePage extends initClass{
	
	//extends initClass
	//call the functions only
	@Test
	public void makeMyTripLogoCheck() {
		
		Assert.assertTrue(makeMyTripHomePage.checkLogo());
	}
	
	
	@Test
	public void makeMyTripTitleCheck() {
		
		//make this testcase pass --intentionally failed
		Assert.assertEquals(makeMyTripHomePage.getTitleOfPage(), "[MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday]");
	}
	
	
	//suppose there are 1000 testcase
	
	
	
	

}
