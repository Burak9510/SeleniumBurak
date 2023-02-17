package com.neotech.lesson02;

public class C_FirefoxDriver implements I_WebDriver{

	public C_FirefoxDriver() {
		System.out.println("Opening FireFox browser");
	}
	
	@Override
	public void get(String url) {
		System.out.println("Firefox landing on " + url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("Firefox get title of the page");
		return "Page Title";
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("Firefox gets the current url");
		return "Page Url";
	}

	@Override
	public void close() {
		System.out.println("Firefox closing the current tab");
		
	}

	@Override
	public void quit() {
		System.out.println("Firefox closing all the tab");
		
	}

	
	
	
		
	}
	


