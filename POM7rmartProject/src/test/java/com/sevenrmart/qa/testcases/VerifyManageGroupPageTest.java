package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageGroupPageTest extends BasePageTest {
  @Test(priority=1,groups={"sanity"})
  public void verifyManagegroupLogin() {
	  
	  loginPage.loginAction(urname, pwd);
	  managegrouppage.manageGroup();
	  Assert.assertTrue( managegrouppage.homePageElements());
  }
  
  
  
  @Test(priority=2,groups={"sanity"})
  public void verifyGroupAction()
  {
	  managegrouppage.newGroup();
	  Assert.assertTrue(managegrouppage.displayText());
	  managegrouppage.searchGroup();
  }
  
  
}
