package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {
	
//	 Open chrome browser
//	 Go to “https://demo.guru99.com/test/newtours/”
//	 Click on Register Link
//	 Fill out just
//     First Name:
//     Last Name:
//     Phone:
//     Email:
//     And Click Submit
//	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver(); // up-casting
        
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        
//        Doing it in one step
        // driver.findElement(By.linkText("REGISTER")).click();
        
        //Doing it in two steps
        WebElement element = driver.findElement(By.linkText("REGISTER"));
        element.click();
        
        Thread.sleep(1000);

        
        driver.findElement(By.name("firstName")).sendKeys("Mertcan");
        driver.findElement(By.name("lastName")).sendKeys("Sensoy");
        driver.findElement(By.name("phone")).sendKeys("472-601-9134");
        driver.findElement(By.id("userName")).sendKeys("merttheboss@gmail.com");
        
        Thread.sleep(2000);

        driver.findElement(By.name("submit")).click();
        Thread.sleep(2000);
        
        driver.quit();		
	}

}
