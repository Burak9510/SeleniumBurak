package com.neotech.lesson05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static String url = "http://uitestpractice.com/Students/Form";
	
	public static void main(String[] args) throws InterruptedException {
//		Radio Button Practice  
//		Open chrome browser
//		Go to "http://uitestpractice.com/Students/Form"
//		Verify if all radio buttons are displayed and clickable
//		Click on all radio buttons
//		Verify radio buttons has been clicked successfully
//		Quit browser

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		
		List<WebElement> list = driver.findElements(By.xpath("//label[@class='radio-inline']"));
		
		for(WebElement rb : list) 
		{ 
			if(rb.isDisplayed()) 
			{ rb.click();
		      System.out.println(rb.getText() + " is displayed and clickable");
			}
			else
			{
				System.out.println(rb.getText() + " is not displayed");
			}
		
			Thread.sleep(2000);
			
			driver.quit();
		
		
		}
		
		
		
		
		
	}

}
