package com.PB.pagestest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.util.com_constant_util;

public class opennew_pagestest extends PBbasesetup{
	@BeforeClass
	public void navigateTo_OpenNewAccountTest() {
		lp.successfullLogin(prop.getProperty("Username"), prop.getProperty("Password"));
		hp.navigateTo_OpenNewAccount();
	}
	@Test(priority=1)
	public void currenurlTest() {
		String Act=OAP.currenurl();
		Assert.assertEquals(Act, com_constant_util.PB_OPEN_ACC_URL);
	}
	@Test(priority=2)
	public void headertextTest() {
		String Act_text=OAP.headertext();
		Assert.assertEquals(Act_text, com_constant_util.PB_OPEN_ACC_HEADER);
	}
	@Test(priority=3)
	public void createAccountTest() {
		String Act_msg=OAP.createAccount("CHECKING", "13344");
		Assert.assertEquals(Act_msg,com_constant_util.PB_CREATE_ACC_CONF_MSG);
	}

}


