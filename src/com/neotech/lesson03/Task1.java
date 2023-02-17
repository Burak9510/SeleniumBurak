package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

//	Using Xpath ONLY
//	TC 1: Facebook login:
//	1. Open chrome browser
//	2. Go to “https://www.facebook.com/”
//	3. Enter valid username and valid password
//	and click login
//	4. User successfully logged in
	
	public final static String url = "https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("burak3495@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("05057531877");
		
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button[contains(@id, 'u_0')]")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
