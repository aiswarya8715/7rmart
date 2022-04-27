package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageFooterPage {
	
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public  ManageFooterPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[8]/a/p")
WebElement managecontent;

@FindBy(xpath="//p[text()=\"Manage Footer Text\"]")
WebElement managefooter;

@FindBy(xpath="//h1[@class=\"m-0 text-dark\"]")
WebElement footertext;

@FindBy(xpath="//i[@class=\"fas fa-edit\"]")
WebElement editbtn;

@FindBy(name="phone")
WebElement phone;

@FindBy(name="Update")
WebElement updatebtn;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alerttext;

public void manageFooter()
{
	elementUtil.click(managecontent);
	waitUtil.waitForElementVisible(managefooter);
	elementUtil.click(managefooter);
	
}
public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(footertext);
	return a;
}

public void editAction()
{
	elementUtil.click(editbtn);
	elementUtil.sendKeys(phone, "9876543845");
	elementUtil.click(updatebtn);
}
public boolean displayCheck()
{
	boolean en=alerttext.isDisplayed();
	return en;
}

}


