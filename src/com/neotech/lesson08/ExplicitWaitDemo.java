package com.neotech.lesson08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExplicitWaitDemo extends BaseClass {

	
	public static void main(String[] args) throws InterruptedException {
		
		//http://uitestpractice.com/Students/Contact
	
	setUp();
	
	driver.findElement(By.linkText("This is a Ajax link")).click();
	
	// We are creating an object of WebDriverWait
	//We are defining the maximum time to wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
	
	//Dont use this way
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("ContactUs"))));
	
	// We are defining the condition for which element to wait 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CantactUs")));
	WebElement div = driver.findElement(By.className("ContactUs"));
	
	
	boolean isDisplayed = div.isDisplayed();
	System.out.println("Div isDisplayed " + isDisplayed);
	
	Thread.sleep(1000);
	
	tearDown();
	
	}
}
