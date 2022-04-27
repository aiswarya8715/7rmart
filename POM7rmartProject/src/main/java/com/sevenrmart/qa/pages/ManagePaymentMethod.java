package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManagePaymentMethod {
	
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public   ManagePaymentMethod (WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[17]/a")
WebElement managepayment;

@FindBy(xpath="/html/body/div/div[1]/section/div[5]/div[2]/table/tbody/tr[1]/td[4]/a")
WebElement edit1;

@FindBy(xpath="/html/body/div/div[1]/section/div[5]/div[2]/table/tbody/tr[2]/td[4]/a")
WebElement edit2;

@FindBy(id="limit")
WebElement codlimit;

@FindBy(name="Update")
WebElement updatebtn;

@FindBy(name="limit")
WebElement banklimit;

@FindBy(xpath="//h1[text()=\"Manage Payment Methods\"]")
WebElement managepaymenttext;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alert1;
public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(managepaymenttext);
	return a;
}
public void managePayment()
{
	elementUtil.click(managepayment);
}
public void editPaymentCod()
{
	elementUtil.click(edit1);
	elementUtil.sendKeys(codlimit, "25000");
	elementUtil.click(updatebtn);
	elementUtil.displayCheck(alert1);
	System.out.println("successfully updated COD");
}
public void editPaymentBank()
{
	elementUtil.click(edit1);
	elementUtil.sendKeys(banklimit, "50000");
	elementUtil.click(updatebtn);
	elementUtil.displayCheck(alert1);
	
}
}
