package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManagePagesPage {
	
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public  ManagePagesPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}
	
@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[8]/a/p")
WebElement managecontent;

@FindBy(xpath="//p[text()=\"Manage Pages\"]")
WebElement managepages;

@FindBy(id="title")
WebElement title;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")
WebElement newbtn;

@FindBy(xpath="//div[@class=\"note-editable card-block\"]")
WebElement descript;

@FindBy(id="page")
WebElement textpage;

@FindBy(name="create")
WebElement savebtn;

@FindBy(name="main_img")
WebElement uploadbtn;

@FindBy(xpath="//a[@class=\"btn btn-default btn-fix\"]")
WebElement cancelbtn;

@FindBy(xpath="//h1[@class=\"m-0 text-dark\"]")
WebElement listpagetext;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement searchbtn;

@FindBy(name="un")
WebElement txttitle;

@FindBy(name="Search")
WebElement searchbtn1;

@FindBy(xpath="//i[@class=\"fas fa-trash-alt\"]")
WebElement delete;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alerttext;

public void manageContent()
{
	elementUtil.click(managecontent);
	waitUtil.waitForElementVisible(managepages);
	elementUtil.click(managepages);
}
public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(listpagetext);
	return a;
}
public void newAction()
{
	elementUtil.click(newbtn);
	elementUtil.sendKeys(title, "data120");
	elementUtil.sendKeys(descript, "Adding new page");
	elementUtil.sendKeys(textpage, "test101");
	elementUtil.submit(savebtn);
	elementUtil.navigateBack();
	
	
	
	//elementUtil.submit(cancelbtn);
	
}
public void searchTitle()
{
	elementUtil.click(managepages);
	elementUtil.click(searchbtn);
	waitUtil.waitForElementVisible(txttitle);
	elementUtil.sendKeys(txttitle, "data120");
	elementUtil.click(searchbtn1);
	elementUtil.click(delete);
	elementUtil.acceptAlert();
}
public boolean displayCheck()
{
	boolean en=alerttext.isDisplayed();
	return en;
}
}

