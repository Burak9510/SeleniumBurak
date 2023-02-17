package com.neotech.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	
	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String username = "Tester";
	public static String password = "test";
	
	public static void main(String[] args) throws InterruptedException {
	
//		Open chrome browser
//		Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
//		Enter valid username
//		Clear username and enter again valid username
//		Leave password field empty
//		Click on login button
//		Verify error message with text "Invalid Login or Password." is displayed.

	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		//send username
		
		WebElement el = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
		el.sendKeys(username);
		Thread.sleep(2000);
		el.clear();
		el.sendKeys(username);
		Thread.sleep(2000);
		
		//send password
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
		
		
		WebElement status = driver.findElement(By.xpath("//span[@id='ctl00_MainContent_status']"));
		if(status.isDisplayed())
		{
			System.out.println("The status with text " + status.getText() + " is displayed");
		}
		else 
		{
			System.out.println("Login was successful!!");
		}
		
		
		Thread.sleep(2000);
		
		driver.quit();
	
	}

}
