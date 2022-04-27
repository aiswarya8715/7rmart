package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageOrderPage {
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public ManageOrderPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}
	@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[3]/a/p")
	WebElement manageorder;
	
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
	WebElement ordersearch;
	
	@FindBy(xpath="//h1[text()=\"List Orders\"]")
	WebElement listorders;
	
	@FindBy(id="od")
	WebElement orderId;
	
	@FindBy(id="um")
	WebElement userId;
	
	@FindBy(id="sd")
	WebElement startdate;
	
	@FindBy(id="ed")
	WebElement enddate;
	
	@FindBy(id="pt")
	WebElement paymode;
	
	@FindBy(id="st")
	WebElement status;
	
	@FindBy(xpath="//button[@name=\"Search\"]")
	WebElement searchBtn;
	
	@FindBy(name="Reset")
	WebElement resetBtn;
	
	@FindBy(xpath="//i[@class=\"ace-icon fa fa-sync-alt\"]")
	WebElement reset;

	
	public boolean homePageElements()
	{
		boolean a=elementUtil.displayCheck( listorders);
		return a;
	}
	
	public void order()
	{
		elementUtil.click(manageorder);
		elementUtil.click(ordersearch);
	}
	public void searchOrder()
	{
		elementUtil.sendKeys(userId, "123");
		elementUtil.sendKeys(orderId, "34");
		elementUtil.sendKeys(startdate, "08-04-2022");
		elementUtil.sendKeys(enddate, "28-04-2022");
		//elementUtil.click(paymode);
		elementUtil.selectDropdown(paymode, "index", "2");
		elementUtil.selectDropdown(status, "index", "2");
		elementUtil.click(searchBtn);
		elementUtil.click(resetBtn);
		elementUtil.click(reset);
		
	}
	
	}


