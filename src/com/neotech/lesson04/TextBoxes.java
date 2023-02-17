package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxes {

	
	public static String url = "https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		//1st wasy
		
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Hakan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']")).sendKeys("Naim");
		
		driver.findElement(By.cssSelector("#RESULT_TextField-2")).clear();
		driver.findElement(By.cssSelector("#RESULT_TextField-2")).sendKeys("Muti");
		Thread.sleep(2000);
		
		
		//2nd way: redundancy and reusability
		WebElement fname = driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']"));
		fname.clear();
		fname.sendKeys("Baris");
		String idAttribute = fname.getAttribute("id");
		System.out.println("The value of the id attribute is: " + idAttribute);
		
		WebElement lname = driver.findElement(By.cssSelector("#RESULT_TextField-2"));
		lname.clear();
		lname.sendKeys("Yasar");
		System.out.println("Value of the classs attribute is: " + lname.getAttribute("class"));
		
		WebElement header = driver.findElement(By.xpath("//h1[text()='Volunteer Sign Up']"));
		String  headerText = header.getText();
		System.out.println("The header is: " + headerText);
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
		
		
	}
}
