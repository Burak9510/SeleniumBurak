package com.neotech.test;

import com.neotech.pages.DashboardPage;
import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPOM extends CommonMethods {

	public static void main(String[] args) {
		// https://hrm.neotechacademy.com/

	setUp();

    // At this point we are locating the elements
	LoginPage login = new LoginPage();

	// sending the username
	sendText(login.username, ConfigsReader.getProperty("username"));

	// sending the password
	sendText(login.password, ConfigsReader.getProperty("password"));

	// click on Login button
	login.loginBtn.click();

	// Same thing using the click() in CommonMethods
	// click(login.loginBtn);

	wait(5);

	// Validate login by using the logo
	DashboardPage dashboard = new DashboardPage();

	if (dashboard.logo.isDisplayed()) {
		System.out.println("Test passed!");
	} else {
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


