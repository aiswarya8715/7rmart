package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageContactPageTest extends BasePageTest{
  @Test(priority=1)
  public void verifyManageContact() {
	  
	  loginPage.loginAction(urname, pwd);
	  managecontactpage.mangeContact();
	  Assert.assertTrue( managecontactpage.homePageElements());
  }
  
  
 
  @Test(priority=2)
  public void verifyEditContact()
  {
	  managecontactpage.editContact();
	  Assert.assertTrue( managecontactpage.displayCheck());
	  System.out.println("Successfully updated");
	  
  }
 
}
