package com.neotech.lesson15;

import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends CommonMethods{

	public static void main(String[] args) {
	
		/*
		 * TC 2: Orange HRM wrong password validation
          1. Go to https://hrm.neotechacademy.com/
          2. Enter valid username and wrong password
          3. Click on login button
          4. Verify error message with text "Invalid Credentials" is displayed
		 */
	
	
		setUp();
		
        LoginPageUsingFactory login = new LoginPageUsingFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "wrong");
		
		wait(2);
		login.loginBtn.click();
		wait(2);
        
		
      
		if(login.passWrong.isDisplayed())	
		{
			System.out.println("Test Passed");
		}else
		{
			System.out.println("Test Failed!");
		}
		
	
				
		
		
		
		tearDown();
		
		
	
	}

}
