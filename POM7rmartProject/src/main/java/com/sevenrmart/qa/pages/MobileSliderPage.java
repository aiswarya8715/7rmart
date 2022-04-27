package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.constants.Constants;
import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class MobileSliderPage {

	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public MobileSliderPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[11]/a")
WebElement mobileslider;

@FindBy(xpath="/html/body/div/div[1]/div/div/div/div[1]/h1")
//@FindBy(xpath="//h1[text()=\"Add Mobile Slider\"]")
WebElement mobileslidertext;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")
WebElement newbtn;

@FindBy(id="cat_id")
WebElement category;

@FindBy(name="main_img")
WebElement choosefile;

@FindBy(name="create")
WebElement savebtn;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-warning\"]")
WebElement reset;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alert;

public void mobileSlider()
{
	elementUtil.click(mobileslider);
	
	
}

public boolean homePageElements()
{
	waitUtil.waitForElementVisible(mobileslidertext);
	boolean a=elementUtil.displayCheck(mobileslidertext);
	return a;
}
	public void addMobileSlider()
	{
		elementUtil.click(newbtn);
		elementUtil.click(category);
		elementUtil.selectDropdown(category, "index", "2");
		choosefile.sendKeys(Constants.upload_file1);
		elementUtil.click(savebtn);
		elementUtil.displayCheck(alert);
		
	}
	public boolean displayElement()
	{
		boolean s=elementUtil.displayCheck(alert);
		return s;
	}
	public void resetSlider()
	{
		
		elementUtil.click(mobileslider);
		elementUtil.click(reset);
	}
}
