package com.PB.pages;

import org.openqa.selenium.WebDriver;

import com.PB.util.com_element_util;

public class PB_findtransaction {
	private WebDriver driver;
	private com_element_util eu;

	public PB_findtransaction(WebDriver driver) {
		this.driver = driver;
		eu=new com_element_util(driver);
	}
	public String url() {
		return eu.geturl();
	}

}
