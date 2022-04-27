package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageCodPageTest extends BasePageTest {
  @Test(priority=1,groups= {"sanity"})
  public void VerifyManageCodLogin() {
	  
	  loginPage.loginAction(urname, pwd);
	  managecodpage.manageCod();
	  Assert.assertTrue(managecodpage.homePageElements());
  }
 
  @Test(priority=2,groups={"sanity"}) 
  public void  verifyAddCod()
  {
	  managecodpage.addCod(); 
	 Assert.assertTrue(managecodpage.displayCheckElement());
  }
  
}
