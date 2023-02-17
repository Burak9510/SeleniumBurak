package com.neotech.test;

import com.neotech.pages.DashboardPageUsingFactory;
import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingFactory extends CommonMethods{
	
	
	public static void main(String[] args) {
//		https://hrm.neotechacademy.com/
	
	
	setUp();
	
	// At this point we are not locating the elements
	// We are just telling how the elements will be located
	LoginPageUsingFactory login = new LoginPageUsingFactory();
	DashboardPageUsingFactory dashboard = new DashboardPageUsingFactory();
	
	// sending the username
	
	sendText(login.username, ConfigsReader.getProperty("username"));
	
	// sending the password
	sendText(login.password, ConfigsReader.getProperty("password"));

	// click on Login button
	login.loginBtn.click();
	
	wait(2);
	
	// Validate login by using the logo
	
	if(dashboard.logo.isDisplayed()) {
		System.out.println("Test passed!");
	}else {
		System.out.println("Test failed!");
	}
	
	// Let's validate that "Jacqueline White" is displayed
	String expectedName = "Jacqueline White";
	String actualName = dashboard.name.getText();
	
	if (actualName.equals(expectedName)) {
		System.out.println(expectedName + " is displayed!");
	} else {
		System.out.println(expectedName + " is NOT displayed!");
	}
	
	
	
	tearDown();
	
		
		
		
	}

}
