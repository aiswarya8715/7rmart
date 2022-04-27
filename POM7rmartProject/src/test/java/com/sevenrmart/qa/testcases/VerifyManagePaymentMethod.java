package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManagePaymentMethod extends BasePageTest{
  @Test(priority=1)
  public void VerifyManagePayment() {
	  
	  loginPage.loginAction(urname, pwd);
	  managepaymentmethod.managePayment();
	  Assert.assertTrue( managepaymentmethod.homePageElements());
  }
 
  @Test(priority=2)
  public void VerifyEditPayment()
  {
	  managepaymentmethod.editPaymentCod();
	  managepaymentmethod.editPaymentBank(); 
  }
  
 
}