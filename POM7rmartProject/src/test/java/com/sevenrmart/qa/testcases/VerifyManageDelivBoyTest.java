package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageDelivBoyTest  extends BasePageTest{
  @Test(priority=1,groups={"sanity"})
  public void verifyDeliveryLogin() {
	  
	  loginPage.loginAction(urname, pwd);
	  managedeliveryboypage.managedel();
  }
  @Test(priority=2,groups={"sanity"})
  public void verifyPageElement()
  {
	  Assert.assertTrue( managedeliveryboypage.homePageElements());
	  String z=expensecategorypage.getIconColor();
		 System.out.println(z);
		 Assert.assertEquals(z, "#dc3545");
		 String p=expensecategorypage.getFontSize();
		 System.out.println(p);
		 Assert.assertEquals(p, "16px");
  }
  @Test(priority=3,groups={"sanity"})
  public void verifyNewDelivery()
  {
	  managedeliveryboypage.newDelivery();
	  managedeliveryboypage.searchDeliBoy();
  }
  
  
}
