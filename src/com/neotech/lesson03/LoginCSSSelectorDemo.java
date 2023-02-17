package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSSelectorDemo {

	public final static String url = "http://sis.neotechacademy.com:9000/Test/";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(url);

	    // using xpath --- //input[@id="tUsername"]
		//using css -- input#tUsername (#tUsername) (tag#id
		
		driver.findElement(By.cssSelector("input#tUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#tPassword")).sendKeys("Neotech$123");
	
	
	    //click on Login
	   //using css : input.buttonBig (tag.class)
		
		driver.findElement(By.cssSelector("input.buttonBig")).click();
		
		//  a[href$='Personal.aspx']
		driver.findElement(By.cssSelector("a[href$='Personal.aspx']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
