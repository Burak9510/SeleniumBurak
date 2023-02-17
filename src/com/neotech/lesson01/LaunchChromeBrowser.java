package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//C:\Users\burak\eclipse-workspace\Selenium\drivers -- Full Path
		// drivers/chromedriver.exe  ---> Relative Path

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // which driver, and where is it
		
		//creating a new object of ChromeDriver
        //upcasting it to WebDriver object
		
		WebDriver driver = new ChromeDriver(); // opened the browser for us
	
	    
		driver.get("https://www.neotechacademy.com/");
	
		String url = driver.getCurrentUrl();
		System.out.println("url: " + url);
		
		String title = driver.getTitle();
		System.out.println("title: " + title);
	
		Thread.sleep(5000); // 5000 milliseconds ==> 5 seconds 
		
	    driver.close();	
	}
}
