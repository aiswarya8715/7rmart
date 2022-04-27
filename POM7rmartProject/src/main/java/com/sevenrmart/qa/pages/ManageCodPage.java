package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageCodPage {
	
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public  ManageCodPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}
@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[15]/a")
WebElement managecod;

@FindBy(xpath="//h1[text()=\"Add COD\"]")
WebElement addcodtext;

@FindBy(name="cod")
WebElement radio;

@FindBy(name="create")
WebElement svebtn;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alert;

public void manageCod()
{
	elementUtil.click(managecod);
}
public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck( addcodtext);
	return a;
}

public void addCod()
{
	
	elementUtil.click(radio);
	elementUtil.click(svebtn);
}
public boolean displayCheckElement()
{
	boolean s=elementUtil.displayCheck(alert);
	return s;
}

}
