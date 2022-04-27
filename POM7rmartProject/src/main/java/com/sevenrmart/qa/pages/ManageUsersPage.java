package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageUsersPage {
	
	
		WebDriver driver;
		ElementUtil elementUtil;
		WaitUtil waitUtil;
		
	public ManageUsersPage(WebDriver driver)
		
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			elementUtil=new ElementUtil(driver);
			waitUtil=new WaitUtil(driver);
		}
@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[6]/a/p")
WebElement manageusers;

@FindBy(xpath="//h1[text()=\"List Users\"]")
WebElement listusertxt;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement search1;

@FindBy(name="un")
WebElement name;

@FindBy(id="ut")
WebElement email;

@FindBy(id="ph")
WebElement phno;

@FindBy(name="st")
WebElement status;

@FindBy(name="Search")
WebElement search2;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-warning\"]")

WebElement resetBtn;
public void manageUsers()
{
	elementUtil.click(manageusers);
	

}
public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(listusertxt );
	return a;
}


public void manageUserSrch()
{
	elementUtil.click(search1);
	elementUtil.sendKeys(name, "arya dd");
	elementUtil.sendKeys(email, "aryadineshdd10@gmail.com");
	elementUtil.sendKeys(phno,"8594017324");
	elementUtil.selectDropdown(status, "index", "1");
	elementUtil.click(search2);
	//elementUtil.click(resetBtn);
}
}
