package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import org.testng.annotations.Test;

public class demoTest extends bookingPage {
	
//	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver-2");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void bookingflight() throws InterruptedException {
		driver.navigate().to("https://www.tiket.com/pesawat");
		doTransactions();
		doCheckout();
		doPayment();
    }
	
	@Test
	public void bookingsTrain() throws InterruptedException {
		driver.navigate().to("https://www.tiket.com/kereta-api");
		transactionsTrain() ;
		doCheckoutTrain();
		doPayment();
    }
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}	
}
