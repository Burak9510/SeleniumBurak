package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CalenderDemo extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		//click on the calender
		
		driver.findElement(By.xpath("//span[@id='calDepartLabelCont']/span[2]")).click();
		
		String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		//loop until we see the month we want
		while(!month.equals("April"))
		{
			//click next 
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			//update month
			driver.findElement(By.xpath("//table[@class='dl-datepicker-calendar']")).getText();
		}
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
		//table[@class='dl-datepicker-calendar']/tbody/tr/td
		
		tearDown();
		
	}

}
