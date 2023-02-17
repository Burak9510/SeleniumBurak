package com.neotech.lesson09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {

//	TC 1: Table headers and rows verification
//
//	1. Open chrome browser
//	2. Go to "https://www.techlistic.com/p/demo-selenium-practice.html"
//	3. Verify table consists "Financial Center".
//	4. Print name of all column headers
//	5. Print data of all rows
//	6. Quit Browser
	public static void main(String[] args) {
	
		setUp();
		
		List<WebElement> headerData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		
		Iterator<WebElement> it = headerData.iterator();
		
		while(it.hasNext())
		{
			String headerText = it.next().getText();
			
			System.out.print(headerText + " | ");
		}
		System.out.println();
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		System.out.println("The number of rows is: " + rows.size());
		
		List<WebElement> rowData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td"));
		
		
		for(WebElement data : rowData)
		{
			System.out.println(data.getText());
		}
		
		tearDown();

	}

}
