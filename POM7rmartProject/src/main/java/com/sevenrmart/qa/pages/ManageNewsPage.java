package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageNewsPage {
	
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public  ManageNewsPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[8]/a/p")
WebElement managecontent;

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[8]/ul[4]/li/a")
WebElement managenews;

@FindBy(xpath="//h1[text()=\"Manage News\"]")
WebElement managenewstext;

@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")
WebElement newbtn;

@FindBy(name="news")
WebElement txtnews;

@FindBy(name="create")
WebElement savebtn;

@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[2]")
WebElement searchbtn;

@FindBy(name="un")
WebElement seachtitle;

@FindBy(name="Search")
WebElement searchbtn1;

@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[2]/a[2]")
WebElement delete;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alerttext;

public void manageNews()
{
	elementUtil.click(managecontent);
	waitUtil.waitForElementVisible(managenews);
	elementUtil.click(managenews);
}

public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(managenewstext);
	return a;
}

public void newAction()
{
	elementUtil.click(newbtn);
	elementUtil.sendKeys(txtnews, "New data");
	elementUtil.click(savebtn);
}
public boolean alertText()
{
	boolean s=elementUtil.displayCheck(alerttext);
	return s;
}

public void searchAction()
{
	elementUtil.click(managenews);
	waitUtil.waitForElementVisible(searchbtn);
	elementUtil.click(searchbtn);
	elementUtil.sendKeys(seachtitle, "New data");
	elementUtil.click(searchbtn1);
	//waitUtil.waitForElementVisible(delete);
	
	//elementUtil.click(delete);
}
}

