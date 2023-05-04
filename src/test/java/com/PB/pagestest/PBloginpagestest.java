package com.PB.pagestest;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.PB.util.com_constant_util;


import org.testng.annotations.Test;

public class PBloginpagestest extends PBbasesetup {
	@Test(priority=1)
	public void currenturlTest() {
		String Act_url=lp.currenturl();
		boolean Acturl=Act_url.equals(com_constant_util.PB_LOGIN_URL);		
		Assert.assertTrue(Acturl);
	}
	@Test(priority=2)
	public void headertextTest() {
		String Act_header=lp.headertext();
		boolean Actheader=Act_header.equals(com_constant_util.PB_LOGINPAGE_HEADER);
		Assert.assertTrue(Actheader);
	}
	@Test(priority=3)
	public void errormsgTest() {
		lp.successfullLogin("xyz", "xyz");
		String act_msg=lp.errormsg();
		Assert.assertEquals(act_msg, "Error!");	
	}
	@Test(priority=4)
	public void errtextTest() {
		lp.successfullLogin("john", "xyz");
		String err_header=lp.errtext();
		Assert.assertEquals(err_header, "The username and password could not be verified.");
	}
	@Test(priority=5)
	public void invalidloginTest() {
		String url=lp.invalidlogin("john", "xyz");
		Assert.assertEquals(url, com_constant_util.PB_INVALID_LOGIN_URL);
	}
	@Test(priority=6)
	public void invalidloginTest1() {
		String url=lp.invalidlogin("xyz", "demo");
		Assert.assertEquals(url, com_constant_util.PB_INVALID_LOGIN_URL);
	}
	@Test(priority=7)
	public void invalidloginTest2() {
		String url=lp.invalidlogin("xyz", "xyz");
		Assert.assertEquals(url, com_constant_util.PB_INVALID_LOGIN_URL);
	}	
	@Test(priority=8)
	public void successfullLoginTest() {
		String Act_url=lp.successfullLogin(prop.getProperty("Username"), prop.getProperty("Password"));
		Assert.assertEquals(Act_url, com_constant_util.PB_HOMEPAGE_URL);
	}
		
	

}
