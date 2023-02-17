package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * TC 1: Disciplinary Cases Search Validation
		 * 
		 * Open chrome browser 
		 * Go to https://hrm.neotechacademy.com/ 
		 * Login into the application 
		 * Select Discipline 
		 * Select Disciplinary Cases 
		 * Click on Filter (Up-Right next to Help) 
		 * Select from January 6, 2023 to February 15, 2023 
		 * Click on Search 
		 * Validate that there are no rows in result table 
		 * Quit the browser
		 */
		
		setUp();
		
		//login to hrm page
		
		//login
		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//navigate to Disciplinary Cases
		driver.findElement(By.id("menu_discipline_defaultDisciplinaryView")).click();
		driver.findElement(By.linkText("Disciplinary Cases")).click();
		
		////notice that there is a frame, move to the frame
		driver.switchTo().frame(0);
		
		//click on filter
		driver.findElement(By.id("searchModal")).click();
		
		//click on the calender
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateFrom")).click();
		
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//input[1]")).click();
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateFrom_root']//li/span[text()='January']")).click();
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateFrom_table']/tbody/tr/td"));
		
		for(WebElement date : dates)
		{
			if(date.getText().equals("6"))
			{
				date.click();
				break;
			}
		}
		Thread.sleep(3000);
		
		//next date
		//click on the calendar
		driver.findElement(By.id("DisciplinaryCaseSearch_createdDateTo")).click();
		
		//click on january
		// Shows the months
		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//input[1]")).click();

		driver.findElement(By.xpath("//div[@id='DisciplinaryCaseSearch_createdDateTo_root']//li/span[text()='February']")).click();
		
		Thread.sleep(3000);
		//select the date
		
		List<WebElement> dates2 = driver.findElements(By.xpath("//table[@id='DisciplinaryCaseSearch_createdDateTo_table']/tbody/tr/td\""));
		
		for(WebElement date : dates2)
		{
			if(date.getText().equals("15"))
			{
				date.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("searchBtn")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> res = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		System.out.println("Rows --> " + res.size());

		
		tearDown();
		
	}
}
