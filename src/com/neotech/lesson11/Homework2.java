package com.neotech.lesson11;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods{

//	Homework 2:
//	    WindowHandle_Demo at com.neotech.lesson07 using the CommonMethods.java
	
	public static void main(String[] args) {
		//https://accounts.google.com/signup
		
		
		setUp();
		
		
		System.out.println("Title ---> " + driver.getTitle());
		
		click(driver.findElement(By.linkText("help")));
        wait(2);
        
        switchToChildWindow();
        
        System.out.println("Title of the child page is " + driver.getTitle());
        
        driver.close();//this closes the child window
		
		
		tearDown();
		
		
		
	}
}
