package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyManageOrderTest extends BasePageTest{
	
	
	@Test(priority=1)
	public void manageOrder()
	{
		loginPage.loginAction(urname, pwd);
	
	manageorderpage.order();
	Assert.assertTrue(manageorderpage.homePageElements());
	}

  @Test(priority=2)
  public void verifyOrder()
  {
	  manageorderpage.searchOrder();
  }
  
    }

