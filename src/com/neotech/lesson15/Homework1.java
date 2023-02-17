package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.pages.LoginPage;
import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework1 extends CommonMethods{

	public static void main(String[] args) {
		
//		TC 1: Orange HRM blank password validation
//		1. Go to https://hrm.neotechacademy.com/
//		2. Enter valid username and leave password field empty
//		3. Click on login button
//		4. Verify error message with text "Password cannot be empty" is displayed

		setUp();
		
		LoginPageUsingFactory login = new LoginPageUsingFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "");
		
		login.loginBtn.click();
		
		if(login.passErr.isDisplayed()) {
			
			System.out.println(login.passErr.getText() + " is displayed");
		}else
		{
			System.out.println("Nothing to do!");
		}
		
		tearDown();
		
	}
	
}
