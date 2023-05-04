package com.PB.pagestest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.util.com_constant_util;

public class PB_logout_test extends PBbasesetup {
	@BeforeClass
	public void dologoutTest() {
		lp.successfullLogin(prop.getProperty("Username"), prop.getProperty("Password"));
		hp.dologout();
	}
	@Test(priority=1)
	public void getloginpageURLTest() {
		String act=PLO.getloginpageURL();
		Assert.assertEquals(act, com_constant_util.PB_LOGIN_URL);
	}
	@Test(priority=2)
	public void getpageTitleTest() {
		String act_title=PLO.getpageTitle();
		Assert.assertEquals(act_title, com_constant_util.PB_LOGIN_TITLE);
	}

}
