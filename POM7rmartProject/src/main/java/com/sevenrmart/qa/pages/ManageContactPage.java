package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageContactPage {
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public  ManageContactPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[8]/a/p")
WebElement managecontent;

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[8]/ul[3]/li/a")
WebElement managecontact;

@FindBy(xpath="//a[@class=\"btn btn-sm btn btn-primary btncss\"]")
WebElement edit;

@FindBy(id="email")
WebElement email;

@FindBy(id="content")
WebElement address;

@FindBy(name="phone")
WebElement phone;

@FindBy(name="del_limit")
WebElement rate;

@FindBy(name="Update")
WebElement updatebtn;

@FindBy(xpath="//a[@class=\"btn btn-default btn-fix\"]")
WebElement reset;

@FindBy(xpath="//h1[text()=\"Contact Us\"]")
WebElement contactustext;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alerttext;

public void mangeContact()
{
	elementUtil.click(managecontent);
	elementUtil.click(managecontact);
}
public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(contactustext);
	return a;
}

public boolean displayCheck()
{
	boolean en=alerttext.isDisplayed();
	return en;
}

public void editContact()
{
	elementUtil.click(edit);
	elementUtil.sendKeys(phone, "9898989802");
	elementUtil.sendKeys(email, "test@gmail.com");
	elementUtil.sendKeys(address, "Varkala, Kollam");
	//elementUtil.sendKeys(rate, "5000");
	waitUtil.waitForElementVisible(updatebtn);
	elementUtil.submit(updatebtn);

	//waitUtil.waitForElementVisible(reset);
	//elementUtil.click(reset);
}
}
