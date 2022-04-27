package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageOfferCodeTest extends BasePageTest {
  @Test(priority=1)
  public void verifyManageOfferCode() {
	  
	  loginPage.loginAction(urname, pwd);
	  manageoffercodepage.offerCode();
	  Assert.assertTrue(manageoffercodepage.homePageElements());  
	   
  }
  
 
  @Test(priority=2)
  public void verifyAddOffer()
  {
	  manageoffercodepage.newOfferCode();
	  Assert.assertTrue(manageoffercodepage.alertText());
	  manageoffercodepage.searchOfferCode();
  }
  
}
