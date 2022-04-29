package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class AdminUsersPage {
	
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public AdminUsersPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[18]/a")
WebElement adminusers;

@FindBy(xpath="//h1[text()=\"Admin Users\"]")
WebElement adminuserstext;

@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]/i")
WebElement newbtn;

@FindBy(id="username")
WebElement username;

@FindBy(id="password")
WebElement password;

@FindBy(id="user_type")
WebElement usertype;

@FindBy(name="Create")
WebElement savebtn;

@FindBy(xpath="//*[@id=\"adddiv\"]/div/div/div/form/div[2]/a")
WebElement reset;

@FindBy(xpath="/html/body/div/div[1]/section/div[2]/div/div[3]/div[2]/table/tbody/tr[1]/td[5]/a[3]")
WebElement delete;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement searchbtn;

@FindBy(id="un")
WebElement username1;

@FindBy(id="ut")
WebElement usertype1;

@FindBy(name="Search")
WebElement searchbtn2;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alerttext;



public void adminusers() 
{
	elementUtil.click(adminusers);
	
}
public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(adminuserstext);
	return a;
}
public void addAdminUsers()
{
	elementUtil.click(newbtn);
	elementUtil.sendKeys(username, "testdata1");
	elementUtil.sendKeys(password, "1234");
	elementUtil.click(usertype);
	elementUtil.selectDropdown(usertype, "index", "2");
	elementUtil.click(savebtn);
	
}
public boolean displayAlert()
{
	 boolean p=elementUtil.displayCheck(alerttext);
	return p;
}
public void searchAdminUsers()
{
	elementUtil.click(searchbtn);
	elementUtil.sendKeys(username1, "testdata1");
	elementUtil.selectDropdown(usertype1, "index", "2");
	elementUtil.click(searchbtn2);
	elementUtil.click(delete);
	elementUtil.acceptAlert();
}
public boolean displayAlert2()
{
	boolean s=elementUtil.displayCheck(alerttext);
	return s;
	
}
}
