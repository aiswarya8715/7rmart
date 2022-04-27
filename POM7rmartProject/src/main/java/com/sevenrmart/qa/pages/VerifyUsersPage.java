package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class VerifyUsersPage {
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public VerifyUsersPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[5]/a")
WebElement verifyusers;

@FindBy(xpath="//h1[text()=\"List Users\"]")
WebElement listuserstext;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement searchbtn;

@FindBy(id="un")
WebElement name;

@FindBy(name="ut")
WebElement email;

@FindBy(id="ph")
WebElement phno;

@FindBy(name="st")
WebElement status;

@FindBy(name="Search")
WebElement searchBtn;

@FindBy(xpath="//a[@class=\"btn btn-default btn-fix\"]")
WebElement reset;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-warning\"]")
WebElement pagereset;


public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(listuserstext);
	return a;
}

public void verifyUserAction()
{
	elementUtil.click(verifyusers);
	
	
}
public void userSearch()
{
	elementUtil.click(searchbtn);
	elementUtil.sendKeys(name, "Rohith P R");
	elementUtil.sendKeys(email, "rohithprajan96@gmail.com");
	elementUtil.sendKeys(phno, "9745737166");
	elementUtil.click(status);
	elementUtil.selectDropdown(status, "visibletext", "Active");
	elementUtil.click(searchBtn);
	elementUtil.click(reset);
	elementUtil.click(pagereset);
}
}


