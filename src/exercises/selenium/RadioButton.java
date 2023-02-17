package exercises.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class RadioButton  extends BaseClass {
	
//	Radio Button Practice  
//	Open chrome browser
//	Go to "http://uitestpractice.com/Students/Form"
//	Verify if all radio buttons are displayed and clickable
//	Click on all radio buttons
//	Verify radio buttons has been clicked successfully
//	Quit browser

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		List<WebElement> list = driver.findElements(By.xpath("//label[@class='radio-inline']"));
	
		for(WebElement rb : list)
		{
			if(rb.isDisplayed()) 
			{ rb.click();
				System.out.println(rb.getText() + " is displayed and clickable ");
			}
			else
			{
				System.out.println(rb.getText() + " is  NOT displayed and  NOT clickable ");
			}
		}
		
		
		Thread.sleep(3000);
	
		tearDown();
	}

}
