package com.PB.pagestest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class com_tranferfundTest extends PBbasesetup {

	@BeforeClass
	public void navigateTo_Transferfund_Test() {
		lp.successfullLogin(prop.getProperty("Username"), prop.getProperty("Password"));
		hp.navigateTo_Transferfund();
	}
	
	@Test(priority=1)
	public void getpageurlTest() {
		String act=TFP.getpageurl();
		Assert.assertEquals(act, "https://parabank.parasoft.com/parabank/transfer.htm");
	}
	@Test(priority=2)
	public void pageheadertextTest() {
		String act_txet=TFP.pageheadertext();
		Assert.assertEquals(act_txet, "Transfer Funds");
	}
//	@Test(priority=3)
//	public void Transfer_completedTest() {
//		String act=TFP.Transfer_completed("500", "13344");
//		Assert.assertEquals(act, "Transfer Complete!");
//	}
	@Test(priority=3)
	public void Transfer_errorTest() {
		String act=TFP.Transfer_error();
		Assert.assertEquals(act, "The amount cannot be empty.");
	}
}
