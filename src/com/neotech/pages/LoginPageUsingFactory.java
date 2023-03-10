package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;

public class LoginPageUsingFactory {

	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(name = "txtPassword")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;
	
	@FindBy(id = "txtPassword-error")
    public WebElement passErr;
	
	@FindBy(xpath = "//div[@class='toast-message']")
	public WebElement passWrong;
	
	public LoginPageUsingFactory() {
		PageFactory.initElements(BaseClass.driver, this);

	
	
	}
	
}
