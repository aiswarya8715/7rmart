package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageGroupPage {
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public  ManageGroupPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="//p[text()=\"Manage Groups\"]")
WebElement managegroup;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")
WebElement newbtn;

@FindBy(id="titlep")
WebElement title;

@FindBy(name="create")
WebElement savebtn;

@FindBy(xpath="//h1[@class=\"m-0 text-dark\"]")
WebElement listgrouptext;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alerttext;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement search;

@FindBy(name="un")
WebElement grouptxt;

@FindBy(name="Search")
WebElement searchbtn1;

@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr/td[2]/a[2]")
WebElement delete;

public void manageGroup()
{
	elementUtil.click(managegroup);
}

public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(listgrouptext);
	return a;
}
public void newGroup()
{
	elementUtil.click(newbtn);
	elementUtil.sendKeys(title, "Group1");
	elementUtil.click(savebtn);
}
public boolean displayText()
{
	 boolean s=elementUtil.displayCheck(alerttext);
	 return s;
   
	
}
public void searchGroup()
{
	elementUtil.click(managegroup);
	elementUtil.click(search);
	elementUtil.sendKeys(grouptxt, "Group1");
	elementUtil.click(searchbtn1);
	elementUtil.click(delete);
	elementUtil.acceptAlert();
}
}
