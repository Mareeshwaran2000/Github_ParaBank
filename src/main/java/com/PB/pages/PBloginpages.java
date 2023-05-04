package com.PB.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.util.com_element_util;

public class PBloginpages {
private WebDriver driver;

	
	public PBloginpages(WebDriver driver) {
		this.driver=driver;
	}
	private By header=By.tagName("h2");
	private By uname=By.name("username");
	private By pwd=By.name("password");
	private By submit=By.xpath("//input[@class='button']");
	private By error=By.tagName("h1");
	private By err_msg=By.xpath("//div[@id='rightPanel']/p");
	
	public String currenturl() {
		return driver.getCurrentUrl();
	}
	
	public String headertext() {
		return driver.findElement(header).getText()	;
	}
	
	public String successfullLogin(String username, String password) {
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(submit).click();
		return driver.getCurrentUrl();
	}
	public String invalidlogin(String username, String password) {
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pwd).sendKeys(password);
		driver.findElement(submit).click();
		return driver.getCurrentUrl();
	}
	public String errormsg() {
		return driver.findElement(error).getText();
	}
	public String errtext() {
		return driver.findElement(err_msg).getText();
	}
	
	public homepage navigateToHomepage(String username, String password) {
		successfullLogin(username, password);
		return new homepage(driver);
	}

}
