package com.PB.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.util.com_element_util;

public class PB_updatepages {
	private WebDriver driver;
	private com_element_util ad;
	
	public PB_updatepages(WebDriver driver) {
		this.driver=driver;
		ad=new com_element_util(driver);
	}
	
	public String getpageurl() {
		return ad.geturl();
	}
	private By page_header=By.tagName("h1");
	
	public String Page_header() {
		return ad.getelement_text(page_header);
	}
	
	private By fristname=By.id("customer.firstName");
	private By lastname=By.id("customer.lastName");
	private By address=By.id("customer.address.street");
	private By city=By.id("customer.address.city");
	private By state=By.id("customer.address.state");
	private By zip_code=By.id("customer.address.zipCode");
	private By ph_no=By.id("customer.phoneNumber");
	private By click_update=By.xpath("//input[@type=\"submit\"]");
	private By updated_msg=By.xpath("//h1[text()='Profile Updated']");
	
	public String updatedSuccesfully() {
		ad.doclear(fristname, "Messi");
		ad.doclear(lastname, "V");
		ad.doclear(address, "Whitefield");
		ad.doclear(city, "Bangalore");
		ad.doclear(state, "Karnataka");
		ad.doclear(zip_code, "560066");
		ad.doclear(ph_no, "8489222703");
		ad.doclick(click_update);
		ad.WebDriver_Wait(driver, 10, updated_msg);
		return ad.getelement_text(updated_msg);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}



