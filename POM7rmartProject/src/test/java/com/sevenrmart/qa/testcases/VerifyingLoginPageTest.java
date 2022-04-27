package com.sevenrmart.qa.testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sevenrmart.qa.constants.Constants;
import com.sevenrmart.qa.utilities.ExcelRead;





public class VerifyingLoginPageTest  extends BasePageTest{
  @Test(priority=2)
  
  
  public void loginVerification()
  {
	  Assert.assertTrue(loginPage.homePageElements());
	  String expected="https://groceryapp.uniqassosiates.com/admin";
	  String actual=driver.getCurrentUrl();
	  Assert.assertEquals(actual, expected);
	  String title=driver.getTitle();
	 String homepagetitle="Dashboard | 7rmart supermarket";
	 Assert.assertEquals(title, homepagetitle,"title is different");
  }
  
  @Test(dataProvider= "userData",priority=1,groups="sanity")
  public void login(String usname,String pword) {
	  String expected="7rmart supermarket";
	  String actual=loginPage.loginPageText();
	  Assert.assertEquals(actual, expected);
	  loginPage.loginAction(usname,pword);
	 // loginPage.loginAction(urname,pwd);
  }
  @DataProvider()

	public Object[][] userData() throws InvalidFormatException, IOException{

		Object[][] data=ExcelRead.getDataFromExcel(Constants.dataProvider_filepath, "LoginData");

		return data;
  
}
}