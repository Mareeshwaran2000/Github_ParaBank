package com.PB.pagestest;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.PB.driverfactory.PBdriverfactory;
import com.PB.pages.PB_AboutUsPage;
import com.PB.pages.PB_Adminpage;
import com.PB.pages.PB_Billpaypages;
import com.PB.pages.PB_Footerpage;
import com.PB.pages.PB_ServicesPage;
import com.PB.pages.PB_findtransaction;
import com.PB.pages.PB_logout;
import com.PB.pages.PB_requestloan;
import com.PB.pages.PB_updatepages;
import com.PB.pages.PBloginpages;
import com.PB.pages.com_accountoverview;
import com.PB.pages.com_transferfund;
import com.PB.pages.homepage;
import com.PB.pages.opennew_pages;

public class PBbasesetup {
	PBdriverfactory df;
	WebDriver driver;
	Properties prop;
	FileInputStream fl;
	PBloginpages lp;
	homepage hp;
	opennew_pages OAP;
	com_accountoverview AOP;
	com_transferfund TFP;
	PB_Billpaypages bpp;
	PB_findtransaction pft;
	PB_logout PLO;
	PB_updatepages UCI;
	PB_requestloan RLP;
	PB_Adminpage PAP;
	PB_ServicesPage PSR;
	PB_AboutUsPage AUP;
	PB_Footerpage PFP;
	
	@BeforeTest
	public void setup() {
		
		df=new PBdriverfactory();
		prop=df.Initial_prop();
		driver=df.launchbrowser(prop);
		lp=new PBloginpages(driver);
		hp=new homepage(driver);
		OAP=new opennew_pages(driver);
		AOP=new com_accountoverview(driver);
		TFP=new com_transferfund(driver);
		bpp=new PB_Billpaypages(driver);
		pft=new PB_findtransaction(driver);
		PLO=new PB_logout(driver);
		RLP=new PB_requestloan(driver);
		UCI=new PB_updatepages(driver);
		PAP=new PB_Adminpage(driver);
		PSR=new PB_ServicesPage(driver);
		AUP=new PB_AboutUsPage(driver);
		PFP=new PB_Footerpage(driver);
	}
	
	@AfterTest
	public void closebrowser() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
	}
	

}
