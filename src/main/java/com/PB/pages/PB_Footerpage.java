package com.PB.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PB.util.com_element_util;

public class PB_Footerpage {
	private WebDriver driver;
	private com_element_util el;
	
	public PB_Footerpage(WebDriver driver) {
		this.driver=driver;
		el=new com_element_util(driver);
	}
	private By footer=By.xpath("//div[@id=\"footerPanel\"]/ul[1]/li");
	
	public int footer_link_count() {
		return el.GetCount_elements(footer);
		//driver.findElements(footer).size();	
	}
	public String footer_text(int index) {//Products
		return el.Gettext_Webelements(footer, index);
	}
	
	private By click_home=By.xpath("(//div[@id=\"footermainPanel\"]//li)[1]");
	private By ser_links=By.xpath("//ul[@class=\"services\" or @class=\"servicestwo\" or @class=\"events\"]//a");
	
	public int services_links() {
		el.WebDriver_Wait(driver, 5, click_home);
		el.doclick(click_home);
		el.WebDriver_Wait(driver, 10, ser_links);
		return el.GetCount_elements(ser_links);
	}
	
	private By customer_care=By.xpath("//ul[@class=\"button\"]//a[@href=\"contact.htm\"]");
	private By cus_header=By.tagName("h1");
	
	public String customer_care() {
		el.doclick(customer_care);
		el.WebDriver_Wait(driver, 5, cus_header);
		return el.getelement_text(cus_header);		
	}
	
	private By name=By.id("name");
	private By e_mail=By.id("email");
	private By ph=By.id("phone");
	private By msg=By.id("message");
	private By clik_sub=By.xpath("//td/input[@type=\"submit\"]");
	
	private By customer_msg=By.xpath("//div[@id=\"rightPanel\"]/p[contains(text(),'will be contacting you.')]");
	
	
	public String customer_care_request() {
		el.dosendskeys(name, "Messi");
		el.dosendskeys(e_mail, "Messi10@gmail.com");
		el.dosendskeys(ph, "8489272203");
		el.dosendskeys(msg, "Messi is innocent");
		
		el.WebDriver_Wait(driver, 5, clik_sub);
		
		el.doclick(clik_sub);
		
		return el.getelement_text(customer_msg);

		
	}
}
	
