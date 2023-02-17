package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
	public static String username = "Tester";
	public static String password = "test";
	
	public static void main(String[] args) {
		
		/*
	    Open chrome browser
        Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
        Enter valid username and password
        Click on login button
        Then verify "Web Orders" is displayed and also username is displayed right top corner
		 */
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		//send username and password
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("username");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("password");
		
		//login
		
		driver.findElement(By.id("ctl00_MainContent_login_button")).submit();
		
		//check if logo is displayed
		
		WebElement logo = driver.findElement(By.xpath("//h1[text()='Web Orders']"));
		if(logo.isDisplayed())
		{
			System.out.println("The logo with text " + logo.getText() + " is displayed!");
		}
		else
		{
			System.out.println("The logo is not displayed!!");
		}
	
		//check if username is displayed
		//locator ---> //div[contains(text(),'Tester')]
	
	
	}
}
