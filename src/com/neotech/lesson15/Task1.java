package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) {
//		Go to https://the-internet.herokuapp.com/key_presses
//			Press TAB, ESC & ENTER
		
		setUp();
		
		WebElement searchBox = driver.findElement(By.id("target"));
		
		searchBox.sendKeys(Keys.ESCAPE);
		wait(1);
		
		searchBox.sendKeys(Keys.TAB);
		wait(1);
		
		searchBox.sendKeys("Test");
		wait(1);
		
		//ENTER will shift focus
		searchBox.sendKeys(Keys.ENTER);
		wait(2);
		
		
		
		
		tearDown();
		
		
	}
}
