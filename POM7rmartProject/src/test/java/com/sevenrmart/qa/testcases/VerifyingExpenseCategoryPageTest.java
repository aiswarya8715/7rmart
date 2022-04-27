package com.sevenrmart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyingExpenseCategoryPageTest extends BasePageTest{
  @Test(priority=2)
  public void expenseVerification() {
	  
	  Assert.assertTrue(expensecategorypage.homePageElements());
	 String expected="https://groceryapp.uniqassosiates.com/admin/expense-category";
	 String actual=driver.getCurrentUrl();
	 Assert.assertEquals(actual, expected);
  }
  
  @Test(priority=1)
  
  public void expenseAction() 
  
  {
	 loginPage.loginAction(urname, pwd);
	 expensecategorypage.elementClick();
	 String z=expensecategorypage.getIconColor();
	 System.out.println(z);
	 Assert.assertEquals(z, "#dc3545");
	 String p=expensecategorypage.getFontSize();
	 System.out.println(p);
	 Assert.assertEquals(p, "16px");
	 // expensecategorypage.elementClick();
	 
	
	 
  }
  
  @Test(priority=3,groups="sanity")
  public void newVerification()
 {
	 
	
	expensecategorypage.expenseCategoryNew();  
	//expensecategorypage.alertmsg();
	expensecategorypage.expenseCategorySearch();
	expensecategorypage.expenseCategoryReset();
	
	
	
 }
 
}

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	
	
  
