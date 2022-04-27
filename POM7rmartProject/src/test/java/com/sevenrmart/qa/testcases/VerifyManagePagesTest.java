package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManagePagesTest extends BasePageTest{
	
  @Test(priority=1)
  public void managePage() {
	  loginPage.loginAction(urname, pwd);
	  managepagespage.manageContent();
	  Assert.assertTrue(managepagespage.homePageElements());
  }
  
 
  @Test(priority=2)
  
  public void verifyNewAction()
  {
	  managepagespage.newAction();
	  managepagespage.searchTitle();
	  Assert.assertTrue(managepagespage.displayCheck());
	  
  }
  
 
}
