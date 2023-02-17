package com.neotech.lesson02;

public class C_ChromeDriver implements I_WebDriver {

	public C_ChromeDriver() {
		System.out.println("Opening Chrome browser");
	}
	
	@Override
	public void get(String url) {
		System.out.println("Chrome landing on " + url);
		
	}

	@Override
	public String getTitle() {
		System.out.println("Chrome get title of the page");
		return "Page Title";
	}

	@Override
	public String getCurrentUrl() {
		System.out.println("Chrome gets the current url");
		return "Page Url";
	}

	@Override
	public void close() {
		System.out.println("Chrome closing the current tab");
		
	}

	@Override
	public void quit() {
		System.out.println("Chrome closing all the tab");
		
	}

}
