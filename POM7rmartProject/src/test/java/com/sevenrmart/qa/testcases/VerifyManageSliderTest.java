package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageSliderTest extends BasePageTest {
  @Test(priority=1,groups={"sanity"})
  public void verifyManageSliderLogin() {
	  
	  loginPage.loginAction(urname, pwd);
	  managesliderpage.manageSlider();
	  Assert.assertTrue(managesliderpage.homePageElements());
  }
  
 
  
  @Test(priority=2,groups= {"sanity"})
  public void verifyNewSlider()
  {
	  managesliderpage.newSlider();
  }
 
}
