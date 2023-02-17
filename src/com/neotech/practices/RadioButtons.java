package com.neotech.practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class RadioButtons extends BaseClass{
	
	//Go to http://uitestpractice.com/Students/Form
    // Check Single
	//Select all the hobbies 
	//See if they are selected after you select each of them
	

	public static void main(String[] args) throws InterruptedException {
	
	setUp();
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("(//input[@name='optradio'])[2]")).click();
	
	List<WebElement> hobbies = driver.findElements(By.xpath("//label[@class='checkbox-inline']"));
	
	for(WebElement hoby : hobbies)
	{
		hoby.click();
		Thread.sleep(1000);	
	}
	Thread.sleep(2000);
	
	tearDown();

	}

}
