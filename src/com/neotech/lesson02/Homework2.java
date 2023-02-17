package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
//	
//	HW2: Opening Page on Firefox Browser
//	Open Firefox browser
//	Navigate to “https://www.redfin.com/”
//	Verify that you have navigated to (https://www.redfin.com/)
//	End the Session (close the browser).

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

		// Open firefox driver
		WebDriver driver = new FirefoxDriver(); // up-casting

		String url = "https://www.redfin.com/";

//        Navigate to /https://www.redfin.com/
		driver.get(url);

		Thread.sleep(1000);

		// getCurrentUrl() returns the url of the page
		String actualURL = driver.getCurrentUrl();

		if (url.equals(actualURL)) {
			System.out.println("Url is as expected -> " + actualURL);
		} else {
			System.out.println(actualURL + " <- is NOT as expected -> " + url);
		}
		Thread.sleep(500); // wait for another 0.5 seconds

		driver.quit();

	}

}
