package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.*;

public class bookingPage {
	
	WebDriver driver;
	
	public void chooseDestination() {
		WebElement setDestination = driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input"));
		setDestination.click();
	}
	
	
	public void doTransactions(){
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[5]/div[1]/div/input")).click();
		chooseDestination();
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div/ul/li[2]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[3]/div[2]/div[2]/div[1]/div/div[2]/div/div/ul/li[3]/div/div")).click();
		driver.findElement(By.cssSelector("#formhome > div > div > div.form-flight.z-index-999 > div.row.wrapper-form > div:nth-child(4) > div:nth-child(2) > div:nth-child(2) > div > div > div.widget-datepicker-content > div > div > div:nth-child(1) > div.DayPicker_focusRegion.DayPicker_focusRegion_1 > div.DayPicker_transitionContainer.DayPicker_transitionContainer_1.DayPicker_transitionContainer__horizontal.DayPicker_transitionContainer__horizontal_2 > div > div:nth-child(2) > div > table > tbody > tr:nth-child(5) > td:nth-child(5) > div")).click();
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[5]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/table/tbody/tr[5]/td[6]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[6]/div[2]/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[5]/button")).click();
		
		WebElement popUpAlert = driver.findElement(By.cssSelector("#app > div > div.left-side > div:nth-child(2) > div > div.wrapper-new-search-result > div > div.col-result.list-horizontal__top > div.sort.row > div.col-xs-4.text-sort.right > div:nth-child(2) > div.comp-info-box > div.v3-btn.v3-btn__blue.list-horizontal__middle.btn-action"));
		popUpAlert.click();
			
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div/div[1]/div/form/div/div[1]/div/div[2]/div/div[2]/div/label")).click();	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div/div[2]/div[3]/div/div/div[1]/div/div[1]/div[1]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[2]/div/div[2]/div/div[2]/div[3]/div/div/div[1]/div/div/div[1]/div")).click();

		
	}
	
	public void transactionsTrain() throws InterruptedException {
		WebElement popUpAlert = driver.findElement(By.cssSelector("#formhome > div > div > div.train-form > div.train-mode-container > section > div.coach-mark > button"));
		popUpAlert.click();
		WebElement setDestination = driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input"));
		setDestination.sendKeys("Bandung");
		System.out.println("Choose Origin");
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div/div[2]/ul/li[1]/div[3]")).click();
		System.out.println("Choose Destination");
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[3]/div[2]/div[2]/div/div/div[2]/ul/li[2]/div[3]")).click();
		System.out.println("Choose Date");
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[4]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[4]/div")).click();
		System.out.println("Choose passenger");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[6]/div[2]/div/div/div[2]/div[1]/div[2]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[3]/div[6]/div[2]/div/div/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"formhome\"]/div/div/div[1]/div[4]/button")).click();
	}
	
	public void doCheckout() {
			//on checkout page
			WebElement tapTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[1]/div/input"));
			tapTitle.click();
			WebElement chooseTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[1]/div/div[3]/ul/li[2]"));
			chooseTitle.click();
			WebElement inputName = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[1]/div[2]/div/input"));
			WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[2]/div/input"));
			WebElement inputPhoneNumber = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/div[3]/div[2]/div/input"));
					
			inputName.sendKeys("Elly Susilowati");
			inputEmail.sendKeys("elly.testingonly@gmail.com");
			inputPhoneNumber.sendKeys("87808780878");
			WebElement togglingDataBuyer = driver.findElement(By.cssSelector("#app > div > div.left-side > div:nth-child(3) > div > div.row > div > div.pull-left.main > div > div.wrapper-passenger-details > div:nth-child(2) > div > div.heading-passenger-details > label > span.switch"));
			togglingDataBuyer.click();
			
			WebElement nationality = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div/input"));
			nationality.click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div[3]/div[1]/input")).sendKeys("Indonesia");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[3]/div/div/div/div[3]/div[2]/ul/li")).click();
			WebElement proceed = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[2]/div/div[1]/div/div[7]/button"));
			proceed.click();
			System.out.println("ready");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div[3]/div/div[3]/div/div/div/div/div[3]/button[2]")).click();	
			System.out.println("0");
			
			if (driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div/div/div[3]/button")).isEnabled() == true) {
				driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div/div/div/div/div[3]/button")).click();
			}
		}
	
	public void doCheckoutTrain() {
		System.out.print("doing Filter");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div/div[1]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/label")).click();
		System.out.println("choose train");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[3]/button")).click();
		
		System.out.println("Fill Data");
		WebElement inputName = driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[1]/div[2]/div[2]/div/div[1]/div/input"));
		WebElement inputPhoneNumber = driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[1]/div[2]/div[2]/div/div[5]/div/input"));
		WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[1]/div[2]/div[2]/div/div[6]/div/input"));
				
		inputName.sendKeys("Dion Wiyoko");
		inputPhoneNumber.sendKeys("87808780878");
		inputEmail.sendKeys("Dididii.testingonly@gmail.com");
		WebElement togglingDataBuyer = driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[2]/div[2]/div[1]/div/label"));
		togglingDataBuyer.click();
		
		WebElement identityNumber = driver.findElement(By.xpath("//*[@id=\"adult-form-0\"]/div[2]/div/div/div[4]/div/input"));
		identityNumber.sendKeys("123123123123");
		
		if (driver.findElement(By.xpath("//*[@id=\"adult-form-1\"]/div[2]/div/div/div[1]/div/input")).isEnabled() == true) {
			driver.findElement(By.xpath("//*[@id=\"adult-form-1\"]/div[2]/div/div/div[1]/div/input")).sendKeys("Dio Dina");
			driver.findElement(By.xpath("//*[@id=\"adult-form-1\"]/div[2]/div/div/div[4]/div/input")).sendKeys("121121121121");
		}
		
		System.out.print("Choose Seat");
		driver.findElement(By.xpath("//*[@id=\"contact-form\"]/div[4]/button[1]")).click();
		System.out.print("Continue to Payment");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div/div/div[4]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"popup\"]/div/div/div/div[5]/button[1]")).click();
	}
			
	public void doPayment(){	
			//choose payment method
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div[1]/div/div[2]/div[4]/div/a[1]/div/div")).click();
			System.out.println("1");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div[1]/div/div/div[4]/div[2]/button")).click();
			System.out.println("2");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div[2]/div[1]/div/div/div/div[3]/div[2]/button")).click();
			
			WebElement FinishButton = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/div[2]/div/button"));
			String FinishButtonIs  =  FinishButton.getText();
				if (FinishButtonIs.equalsIgnoreCase("KE MY ORDER")){
					String ExpectedTitle = "KE MY ORDER";
					Assert.assertEquals(FinishButtonIs, ExpectedTitle);
					System.out.println(" Transaction Successfully Created \n");
				}

	}

}
