package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver(); // up-casting

	        driver.get("https://www.facebook.com/");
	        
	        // typing email into the username textbox
	        driver.findElement(By.id("email")).sendKeys("burak3495@gmail.com");
	
	        Thread.sleep(1000);
	        
	        //  typing the password
	        driver.findElement(By.name("pass")).sendKeys("05057531877");
	        Thread.sleep(2000);
	        
//	        driver.findElement(By.id("u_0_9_nS")).click();
	        
//	        // click on Link -> Forgot Password?
//	        driver.findElement(By.linkText("Forgot password?")).click();
//	        
	        
	        Thread.sleep(2000);
	       
	        driver.quit();
	
	}
}
