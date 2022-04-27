package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyAdminUsersPageTest extends BasePageTest{
  @Test(priority=1)
  public void verifyAdminUsersLogin() {
	  
	  loginPage.loginAction(urname, pwd);
	  adminuserspage.adminusers();
	  Assert.assertTrue(adminuserspage.homePageElements());  
	  
  }
 
  @Test(priority=2)
  public void verifyAddAdminUsers()
  
  {
	  adminuserspage.addAdminUsers(); 
	  Assert.assertTrue(adminuserspage.displayAlert());
	  adminuserspage.searchAdminUsers();
	  Assert.assertTrue(adminuserspage.displayAlert2());
	 
  }
 
  
}
