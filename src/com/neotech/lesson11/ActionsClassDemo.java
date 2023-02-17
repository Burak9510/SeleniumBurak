package com.neotech.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionsClassDemo extends CommonMethods{

	public static void main(String[] args) {
		//https://www.amazon.com/
		
		setUp();
		
		
		Actions action = new Actions(driver);
		
		//DO NOT FORGET TO add PERFOM METHOD ---	.perform();
		
		//moveToElement()
		action.moveToElement(driver.findElement(
				By.id("nav-link-accountList-nav-line-1"))).perform();
		
		wait(3);
		
		WebElement el = driver.findElement(By.id("nav-flyout-ya-newCust"));
		
		if(el.getText().contains("Start"))
		{
			System.out.println("Menu is displayed!");
		}
		else
		{
			System.out.println("Menu is NOT displayed!");
		}
		
		
		//how do we perform a right click?
		action.contextClick(el).perform();
		
		wait(3);
		
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		//go to the search box, click on it, send text, double click
		action.moveToElement(searchBox).click().sendKeys("books").doubleClick().perform();
		
		//in one line
	//	action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("books").doubleClick().perform();
		
		wait(3);
		
		
		
		tearDown();
	}
}
