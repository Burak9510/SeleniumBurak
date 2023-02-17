package com.neotech.lesson02;

public class TestWebDriver {

	
	public static void main(String[] args) {
		
	  I_WebDriver driver = new C_FirefoxDriver(); // Polymorphism
	  
	  driver.get("https://www.neotechacademy.com/");
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  driver.close();
	  
	}
}
