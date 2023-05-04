package com.PB.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.util.com_element_util;

public class com_transferfund {
	private WebDriver driver;
	private com_element_util el;
	
	public com_transferfund(WebDriver driver) {
		this.driver=driver;
		el=new com_element_util(driver);
	}
	
	public String getpageurl() {
		return el.geturl();
	}
	
	private By page_header=By.tagName("h1");
	
	public String pageheadertext() {
		return el.getelement_text(page_header);
	}
	
	
//	private By amount=By.id("amount");
//	private By from_acc=By.id("fromAccountId");
//	private By To_acc=By.id("toAccountId");
//	private By click_transfer=By.xpath("//input[@type=\"submit\"]");
//	private By succ_header=By.tagName("h1");
	
//	public String Transfer_completed(String amt, String To_no) {
//		el.dosendskeys(amount, amt);
//		//el.WebDriver_Wait(driver, 5, from_acc);
//		el.Select_drop_drown_Value(from_acc, "13344");
//		//el.Select_drop_drown(from_acc, from_no);
//		el.Select_drop_drown(To_acc, To_no);
//		el.doclick(click_transfer);
//		el.WebDriver_Wait(driver, 10, succ_header);
//		return el.getelement_text(succ_header);
//				
//	}
	private By erroe_msg=By.id("amount.errors");
	private By sub_transfer=By.xpath("//form//input[@class=\"button\"]");
	
	
	public String Transfer_error() {
		//el.WebDriver_Wait(driver, 10, sub_transfer);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		el.doclick(sub_transfer);
		el.WebDriver_Wait(driver, 10, erroe_msg);
		return el.getelement_text(erroe_msg);
	}
}

