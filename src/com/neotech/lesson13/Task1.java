package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) {
		
//		TC 1: Upload file and Take Screenshot
//		1. Navigate to 
//		http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload
//		2. Upload file
//		3. Verify file got successfully uploaded and take screenshot
//		

		setUp();
		
		driver.findElement(By.id("gwt-debug-cwFileUpload"));
		
		String filePath = System.getProperty("user.dir") +
		"/screenshots/Lesson13/Homework2.png";
		
		
		sendText(driver.findElement(By.id("gwt-debug-cwFileUpload")), filePath);
	
		wait(2);
		
		click(driver.findElement(By.xpath("//button[@class='gwt-Button']")));
		
		wait(2);
		
		//handle alert --> found in CommonMethods
		acceptAlert();
		
		//Takind a screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, 
					new File("screenshots/Lesson13/FileUpload.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		wait(2);
		
		
		tearDown();
		
		
		
	}
}
