package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageLocationTest extends BasePageTest {
  @Test(priority=1)
  public void manageLocationLogin() {
	  
	  loginPage.loginAction(urname, pwd);
	  managelocationpage.manageLocation();
	  Assert.assertTrue( managelocationpage.homePageElements());
  }
  
 
  
  @Test(priority=2)
  public void verifyNewLocation()
  {
	 managelocationpage.newLocation();
	 Assert.assertTrue(managelocationpage.alertText()); 
	 managelocationpage.searchLocation();
	 Assert.assertTrue(managelocationpage.alertText());
	  
  }
  
 
}
