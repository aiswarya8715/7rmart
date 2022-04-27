package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageNewsPageTest  extends BasePageTest{
  @Test(priority=1)
  public void verifyManageNewsLogin() {
	  
	  loginPage.loginAction(urname, pwd);
	  managenewspage.manageNews();
	  Assert.assertTrue( managenewspage.homePageElements());
  }
  
 
  @Test(priority=2)
  
  public void verifyNewAction()
  {
	 managenewspage.newAction();
	 Assert.assertTrue( managenewspage.alertText());
	 managenewspage.searchAction();
  }
  
  
}
