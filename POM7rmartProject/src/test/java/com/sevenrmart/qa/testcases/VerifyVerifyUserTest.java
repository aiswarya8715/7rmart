package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyVerifyUserTest extends BasePageTest {
  @Test(priority=1)
  public void verifyUserActions() {
	  loginPage.loginAction(urname, pwd);
	  verifyuserspage.verifyUserAction();
	  Assert.assertTrue( verifyuserspage.homePageElements()); 
  }
  
 
  @Test(priority=2)
  public void verifySearchAction()
  {
	  verifyuserspage.userSearch();
  }
  
  }
  

