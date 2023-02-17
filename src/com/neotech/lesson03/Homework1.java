package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public final static String url = "https://demo.guru99.com/test/newtours/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();

	    driver.get(url);
	    
	    // click on the register link
	    
	    driver.findElement(By.partialLinkText("REGIS")).click();
	    
	    Thread.sleep(2000);
	    
//	    WebElement register = driver.findElement(By.partialLinkText("REGIS"));
//	    register.click();
	    
	    driver.findElement(By.name("firstName")).sendKeys("John");
	    driver.findElement(By.name("lastName")).sendKeys("Smith");
	    driver.findElement(By.name("phone")).sendKeys("333-444-5555");
	    driver.findElement(By.name("userName")).sendKeys("js@gmail.com");
	   
	    // adress info
	    driver.findElement(By.name("address1")).sendKeys("123 prospect st");
	    driver.findElement(By.name("city")).sendKeys("Garfield");
	    driver.findElement(By.name("state")).sendKeys("NJ");
	    driver.findElement(By.name("postalCode")).sendKeys("43209");
	    
	    
	    
	    driver.findElement(By.id("email")).sendKeys("joh123");
	    driver.findElement(By.name("password")).sendKeys("john124234");
	    driver.findElement(By.name("confirmPassword")).sendKeys("john124234");
	
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("submit")).click();
	
	    Thread.sleep(2000);
	    
	    // check if we registered
	    String expectedUrl ="https://demo.guru99.com/test/newtours/register_sucess.php";
	    
	    String actualUrl = driver.getCurrentUrl();
	    
	    if(expectedUrl.equals(actualUrl))
	    {
	    	System.out.println("Test passed!");
	    }else
	    {
	    	System.out.println("Test failed!");
	    }
	    
	    
	    
	    driver.quit();
	
	}

}
