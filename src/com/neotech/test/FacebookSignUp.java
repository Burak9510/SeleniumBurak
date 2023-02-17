package com.neotech.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods{

	public static void main(String[] args) {
	//https://www.facebook.com/r.php
	
		setUp();
	WebElement month = driver.findElement(By.id("month"));
    selectDropdown(month, "Jan");
    
    WebElement day = driver.findElement(By.id("day"));
    selectDropdown(day, "16");
    
    WebElement year = driver.findElement(By.id("year"));
    selectDropdown(year, "1995");
    
   List<WebElement> gender = driver.findElements(By.id("by"));
    clickRadioOrCheckbox(gender, "male");
    
    
    wait(5);
    
    tearDown();
    
    
	
	
	}

}
