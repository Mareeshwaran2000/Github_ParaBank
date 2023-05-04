package com.PB.pagestest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.PB.util.com_constant_util;

public class PB_billpaypagestest extends PBbasesetup {
	@BeforeClass
	public void navigato_Billpaytest() {
		lp.successfullLogin("john", "demo");
		hp.navigato_Billpay();
	}
	@Test(priority=1)
	public void urltest() {
	   String url=bpp.url();
	   Assert.assertEquals(url, "https://parabank.parasoft.com/parabank/billpay.htm");
	}
	@Test(priority=2)
	public void PageheaderTest() {
		String act=bpp.Pageheader();
		Assert.assertEquals(act, com_constant_util.PB_BILLPAGE_HEADER);
	}
	@Test(priority=3)
	public void inform_textTest() {
		String act_url=bpp.inform_text();
		Assert.assertEquals(act_url, "Enter payee information");
	}
	@Test(priority=4)
	public void requiredfieldsTest() {
		int act_count=bpp.requiredfields();
		Assert.assertEquals(act_count, 9);
	}
	@Test(priority=5)
	public void requiredfieldsTextTest() {
		boolean act=bpp.requiredfieldsText("Phone number is required.");
		Assert.assertTrue(act);
	}
	@Test(priority=6)
	public void PaymentcompleteTest() {
		String act=bpp.Paymentcomplete();
		boolean act_contains=act.contains("Bill Payment");
		Assert.assertTrue(act_contains);
		//Assert.assertEquals(act, "Bill Payment Complete");
	}
}
