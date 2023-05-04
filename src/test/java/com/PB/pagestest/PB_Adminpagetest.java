package com.PB.pagestest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.util.com_constant_util;
public class PB_Adminpagetest extends PBbasesetup {
	@BeforeClass
	public void navigateToadminpageTest() {
		lp.successfullLogin(prop.getProperty("Username"),prop.getProperty("Password"));
		hp.navigateToAdminpage();
	}
	@Test(priority=1)
	public void getadminpage_urlTest() {
		String act=PAP.getadminpage_url();
		if(act.equals(com_constant_util.PB_ADMIN_PAGE_URL)) {
			System.out.println("My test case is pass");				
		}else {
			System.out.println("My test case is fail");
		}
	}
	@Test(priority=2)
	public void admin_paheheaderTest() {
		String act_text=PAP.admin_paheheader();
		Assert.assertEquals(act_text,com_constant_util.PB_ADMIN_PAGE_HEADER);
	}
	@Test(priority=3)
	public void admintableheading_textTest() {
		boolean act=PAP.admintableheading_text("Data Access Mode");
		Assert.assertTrue(act);
	}
	@Test(priority=4)
	public void tablecountTest() {
		int act=PAP.tablecount();
		Assert.assertEquals(act,com_constant_util.PB_ADMINPAGE_TABLE_COUNT );
	}
	@Test(priority=5)
	public void databaseTextTest() {
		String act=PAP.databaseText();
		Assert.assertEquals(act,"Database Cleaned");
	}
	
	
	
	
	
	
	
	
	
	
}


