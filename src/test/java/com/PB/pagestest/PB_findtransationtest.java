package com.PB.pagestest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PB_findtransationtest extends PBbasesetup{
	@BeforeClass
	public void navigateto_findtransaction() {
		lp.successfullLogin("john", "demo");
		hp.navigateto_findtransaction();
	}
	@Test
	public void urltest() {
		String url=pft.url();
		Assert.assertEquals(url, "https://parabank.parasoft.com/parabank/findtrans.htm");
	}

}
