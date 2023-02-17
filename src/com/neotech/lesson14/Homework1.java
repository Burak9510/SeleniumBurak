package com.neotech.lesson14;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods{

	public static void main(String[] args) {
//		Homework 1: File Upload
//		Upload a file:
//		http://uitestpractice.com/Students/Widgets

		setUp();
		
		String filePath = System.getProperty("user.dir") + 
				"/screenshots/HRM/screenshot01.png";
		
		sendText(driver.findElement(By.id("image_file")), filePath);
		wait(2);
		
		
		click(driver.findElement(By.xpath("//input[@type='button']")));
		wait(1);
		
		tearDown();
		
		
		
		
		
	}

}
