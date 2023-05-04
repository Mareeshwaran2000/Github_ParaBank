package com.PB.pages;

import org.openqa.selenium.WebDriver;

public class PB_logout {
private WebDriver driver;
	
	public PB_logout(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getloginpageURL() {
		return driver.getCurrentUrl();
	}
	public String getpageTitle() {
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
}
