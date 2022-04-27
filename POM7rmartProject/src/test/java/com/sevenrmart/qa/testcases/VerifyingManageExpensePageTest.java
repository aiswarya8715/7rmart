package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyingManageExpensePageTest extends BasePageTest {
  
	 
	 
  
  
  @Test(priority=1)
  public void manageExp()
  {
	  loginPage.loginAction(urname, pwd); 
	  
	  manageexpensepage.manageAction();
	  String z=manageexpensepage.getIconColor();
		 System.out.println(z);
		 Assert.assertEquals(z, "#dc3545");
		 String p=manageexpensepage.getFontSize();
		 System.out.println(p);
		 Assert.assertEquals(p, "16px");
		 Assert.assertTrue( manageexpensepage.homePageElements());
  }
@Test(priority=2)
  public void verifyOperations() 
  {
	  manageexpensepage.manangeoperation();
	 manageexpensepage.confirmAction();
	 
  }
  @Test(priority=3)
  public void verifySearch() 
  {
	
	  manageexpensepage.searchAction();
	  Assert.assertTrue(manageexpensepage.alertText());
  }
 
}

  

