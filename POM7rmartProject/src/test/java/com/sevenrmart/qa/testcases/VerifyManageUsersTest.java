package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageUsersTest extends BasePageTest {
  @Test(priority=1)
  public void manageUserAction() {
	  loginPage.loginAction(urname, pwd);
	  manageuserspage.manageUsers();
	  Assert.assertTrue(manageuserspage.homePageElements());
  }
  
 
  
  
  @Test(priority=2)
  public void verifySearch()
  {
	  manageuserspage.manageUserSrch();
  }
 
}
