package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class Homework1 extends BaseClass {

//	1) Launch the browser and open the site "http://demo.guru99.com/popup.php"
//	2) Click on link "Click Here". When the user clicks on the "Click Here" link, new child window opens.
//	3) On the Child Window, Enter your email ID and submit.
//	4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
//	5) Close the Child window on which credentials are displayed.Switch to the parent window.
//	6) Quit all browsers

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
	//	/html/body/p/a
		driver.findElement(By.linkText("Click Here")).click();
		// We know that a new windot/tab will open
		
		Thread.sleep(1000);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindow = it.next();
		String childWindow = it.next();
		
		//exception = RunTime Error
		//String window3 = it.next();		
		
		//we need to change the focus to the child window/tab
		driver.switchTo().window(childWindow);
		
		// Locating an element in the child page
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("domino@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		//Using full xpath
		String userID = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		
		//Using Relative xPath
		String password = driver.findElement(By.xpath("//tr[5]/td[2]")).getText();
		
		System.out.println("User ID -> " + userID);
		System.out.println("Password -> " + password);
		
		Thread.sleep(1000);
		
		//How to switch to the parent window
		//1.Leave this page open and switch to the other handle
		//2.Close the current window. We are automatically focusing to the other page
		
	    driver.close();
	    //driver.switchTo().window(parentWindow); -- 2nd way to close page
	    
		Thread.sleep(1000);
	
		
		tearDown();
		
		
		
	}



















}
