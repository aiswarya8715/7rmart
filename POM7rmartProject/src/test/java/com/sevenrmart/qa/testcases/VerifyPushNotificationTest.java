package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPushNotificationTest  extends BasePageTest{
  @Test(priority=1)
  public void notification() {
	  
	  loginPage.loginAction(urname, pwd);
	  pushnotificationpage.pushNotification();
	  Assert.assertTrue(pushnotificationpage.homePageElements());
  }
  

  @Test(priority=3)
   public void verifyNotification() {
	  pushnotificationpage.newNotification();
	  Assert.assertTrue(pushnotificationpage.displayCheck());
	  System.out.println("successfully added");
  }
 
}
