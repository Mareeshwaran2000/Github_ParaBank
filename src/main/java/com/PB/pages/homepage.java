package com.PB.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PB.util.com_element_util;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage{
	private WebDriver driver;
	private com_element_util eu;
	
	public homepage(WebDriver driver) {
		this.driver = driver;
		eu=new com_element_util(driver);
	}
	
	private By header=By.tagName("h2");
	private By total_links=By.xpath("//ul/li");
	private By header_links=By.xpath("//div[@id='leftPanel']/ul/li");
	private By Welcome_links=By.xpath("//div[@id='headerPanel']/ul[@class=\"leftmenu\"]/li/a");
	private By Open_new_acc=By.xpath("//a[text()='Open New Account']");
	private By acc_overview=By.xpath("(//div[@id='leftPanel']//li)[2]");
	
	public String currenturl() {
		System.out.println(driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}
	
	public String headertext() {
		return driver.findElement(header).getText();
	}
	
	public int totallinkscount() {//27
		List <WebElement> total_cou=driver.findElements(total_links);
		ArrayList<String> links=new ArrayList<String>();
		for(WebElement e:total_cou) {
			String Act_text=e.getText();
			links.add(Act_text);
		}
		return links.size();
		
	}
	public int headerlinkscount() {//8
		List <WebElement> header_cou=driver.findElements(header_links);
		ArrayList<String> head_links=new ArrayList<String>();
		for(WebElement e:header_cou) {
			String Act_count=e.getText();
			head_links.add(Act_count);
		}
		System.out.println(head_links.size());
		return head_links.size();
		
	}
	
	public String welcomelinkstext(int index) {
		List <WebElement> Wel_link_text=driver.findElements(Welcome_links);
		ArrayList<String> Wel_links=new ArrayList<String>();
		for(WebElement e:Wel_link_text) {
			String Act_text=e.getText();
			Wel_links.add(Act_text);
		}
		System.out.println(Wel_links.size());
		//return Wel_links.indexOf(index);
		return Wel_links.get(index);		
	}
//Navigation pages	
	public opennew_pages navigateTo_OpenNewAccount() {
		driver.findElement(Open_new_acc).click();
		return new opennew_pages(driver);
	}
	public com_accountoverview navigatetoAccountOverview() {
		driver.findElement(acc_overview).click();
		return new com_accountoverview(driver);
	}
	private By transfer_fund=By.xpath("//a[@href=\"/parabank/transfer.htm\"]");
	
	public com_transferfund navigateTo_Transferfund() {
		eu.doclick(transfer_fund);
		return new com_transferfund(driver);
	}
	private By click_billpay=By.xpath("//a[text()='Bill Pay']");
	public PB_Billpaypages navigato_Billpay() {
		eu.doclick(click_billpay);
		return new PB_Billpaypages(driver);
	}
	private By click_findtrans=By.xpath("//a[text()='Find Transactions']");
	public PB_findtransaction navigateto_findtransaction() {
		eu.doclick(click_findtrans);
		return new PB_findtransaction(driver);
	}
private By navigate_RL=By.xpath("//a[@href=\"/parabank/requestloan.htm\"]");
	
	public PB_requestloan navigateToRequestload() {
		eu.doclick(navigate_RL);
		return new PB_requestloan(driver);
	}
	private By Upadte_contact=By.xpath("//a[@href=\"/parabank/updateprofile.htm\"]");
	
	public PB_updatepages navigateTo_UpadateContactinfo() {
		eu.doclick(Upadte_contact);
		return new PB_updatepages(driver);
	}
	
	private By logout=By.xpath("//a[@href=\"/parabank/logout.htm\"]");
	
	public PB_logout dologout() {
		eu.WebDriver_Wait(driver, 10, logout);
		eu.doclick(logout);
		return new PB_logout(driver);
	}
    private By admin_page=By.xpath("//ul[@class=\"leftmenu\"]//a[@href=\"admin.htm\"]");
	
	public PB_Adminpage navigateToAdminpage() {
		eu.doclick(admin_page);
		return new PB_Adminpage(driver);
	}
    private By services=By.xpath("//ul[@class=\"leftmenu\"]//a[@href=\"services.htm\"]");
	
	public PB_ServicesPage navigateToServicesPage() {
		eu.doclick(services);
		return new PB_ServicesPage(driver);
	}
	private By aboutus=By.xpath("(//div[@id='headerPanel']//li//a[@href=\"about.htm\"])[1]");
	public  PB_AboutUsPage navigateTo_PB_AboutUsPage() {
		eu.doclick(aboutus);
		return new PB_AboutUsPage(driver);
	
	}
	

}
