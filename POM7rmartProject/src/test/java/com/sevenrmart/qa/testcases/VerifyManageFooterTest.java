package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageFooterTest extends BasePageTest {
  @Test(priority=1)
  public void manageFooterLogin() {
	  loginPage.loginAction(urname, pwd);
	  managefooterpage.manageFooter();
	  Assert.assertTrue(managefooterpage.homePageElements());
  }
  
  @Test(priority=2)
  public void verifyEditAction()
  {
	  managefooterpage.editAction();
	  Assert.assertTrue(managefooterpage.displayCheck());
	 
  }
  
 }
