package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // which driver, and where is it
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    // will NOT store the history
	    // wait for the page elements to be loaded
	    
//	    2nd way
	    driver.navigate().to("https://www.facebook.com/");
//	    saves the history
//	    does NOT wait the page to be fully loaded
	    
	    
	    Thread.sleep(1000);
	    
	    driver.manage().window().maximize(); // --> makes full screen
	   // driver.manage().window().fullscreen();// --> makes full screen
	    Thread.sleep(1000);
	    
	    driver.navigate().refresh(); // reload the page
	    Thread.sleep(1000);
	    
	    driver.navigate().to("https://www.amazon.com/");
	    Thread.sleep(1000);
	    
	    driver.navigate().back(); // brings us back to facebook
	    Thread.sleep(1000);
	    
	    driver.navigate().forward(); // brings us forward to amazon
	    Thread.sleep(2000);
	    
	    driver.quit(); // closing and destroying the browser
//        driver.close(); // after I quiting I cannot do anything 	
	
	
	
	}
}
