package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VeifyMobileSlider extends BasePageTest {
  @Test(priority=1)
  public void verifyMobileSlider() {
	  
	  loginPage.loginAction(urname, pwd);
	  mobilesliderpage.mobileSlider();
  }
  
  @Test(priority=2)
  
  public void verifyPage()
  {
	  Assert.assertTrue(mobilesliderpage.homePageElements());
  }
  @Test(priority=3)
  public void verifyAddMobileSlider()
  {
	  mobilesliderpage.addMobileSlider();
	  Assert.assertTrue( mobilesliderpage.displayElement());
	  mobilesliderpage.resetSlider();
  }
 
}
