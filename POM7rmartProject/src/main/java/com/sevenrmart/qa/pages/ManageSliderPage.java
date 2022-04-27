package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.constants.Constants;
import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageSliderPage {

	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public  ManageSliderPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[10]/a")
WebElement manageslider;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")
WebElement newbtn;

@FindBy(name="main_img")
WebElement choosefile;

@FindBy(id="link")
WebElement link;

@FindBy(name="create")
WebElement savebtn;

@FindBy(xpath="//h1[text()=\"List Sliders\"]")
WebElement listsliderstext;

@FindBy(xpath="//h1[text()=\"List Sliders\"]")
WebElement listsliders;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alert;
public void manageSlider()
{
	elementUtil.click(manageslider);
		
}

public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(listsliders);
	return a;
}

public void newSlider()
{
	elementUtil.click(newbtn);
	waitUtil.waitForElementVisible(choosefile);
	choosefile.sendKeys(Constants.upload_file1);
	elementUtil.sendKeys(link, "https://groceryapp.uniqassosiates.com/admin/");
	elementUtil.click(savebtn);
	elementUtil.displayCheck(alert);
	System.out.println("successfully added");
}
}
