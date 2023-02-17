package com.neotech.lesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class OrangeHRM2 {
	
	// A variable that is declared at class level
	//the default is null for String, or 0 for int
	
	public static WebDriver driver;
   
	public static void main(String[] args) throws InterruptedException {
		
		// This line will read the configuration.properties file   
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		
		// if the value of the browser is chrome ...
		switch(ConfigsReader.getProperty("browser").toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		}
	 
	    String website = ConfigsReader.getProperty("url");
	    driver.get(website);
	    
	    String title = driver.getTitle();
		System.out.println("title -> " + title);
		
	    Thread.sleep(3000);
		 
		driver.quit();
	
	
	}
}
