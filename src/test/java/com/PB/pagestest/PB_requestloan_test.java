package com.PB.pagestest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class PB_requestloan_test extends PBbasesetup {

	@BeforeClass
	public void navigateTo_PB_RequestLoanTest() {
		lp.successfullLogin("john", "demo");
		hp.navigateToRequestload();
	}
    @Test(priority=1)
	public void geturlTest() {
		String ACT_url=RLP.geturl();
		Assert.assertEquals(ACT_url,"https://parabank.parasoft.com/parabank/requestloan.htm");
	}
    @Test(priority=2)
    public void HeadertextTest() {
    	String Act_header=RLP.Headertext();
    	Assert.assertEquals(Act_header,"Apply for a Loan");
    }
    @Test(priority=3)
    public void LoanRequestProcessTest() {
    	String ACT_loan=RLP.LoanRequestProcess();
    	Assert.assertEquals(ACT_loan,"Loan Request Processed");
    }
    @Test(priority=4)
    public void LoanErrorMsgTest() {
    	String ACT_msg=RLP.LoanErrorMsg();
    	Assert.assertEquals(ACT_msg,"We cannot grant a loan in that amount with your available funds.");
    }




}
