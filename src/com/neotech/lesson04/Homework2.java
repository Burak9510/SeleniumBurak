package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

//	      Homework 2:
//        Using Css ONLY
//        TC 2: Mercury Tours Registration: 
//        Open chrome browser
//        Go to “http://demo.guru99.com/test/newtours/”
//        Click on Register Link
//        Fill out all required info
//        Click Submit
//        User successfully registered

	public final static String url = "http://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("John");
		driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Axe");
		driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("614-154-7894");
		driver.findElement(By.cssSelector("input#userName")).sendKeys("ja@gmail.com");
		driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("1441 Park Ave");
		driver.findElement(By.cssSelector("input[name='city']")).sendKeys("Columbus");
		driver.findElement(By.cssSelector("input[name='state']")).sendKeys("OH");
		driver.findElement(By.cssSelector("input[name='postalCode']")).sendKeys("15445");
		driver.findElement(By.cssSelector("#email")).sendKeys("ja@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("123456");
		
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		
		Thread.sleep(3000);
			
		driver.quit();
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}