package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ExpenseCategoryPage {
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
	
	
	
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")
	WebElement expensenewbtn;
	
	
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
	WebElement expensesearchbtn;
	
	@FindBy(xpath="//a[@class=\"btn btn-rounded btn-warning\"]")
	WebElement expenseresetbtn;
	
	@FindBy(xpath="//h1[@class=\"m-0 text-dark\"]")
	WebElement expensetext;
	
	@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[2]/a/p")
	WebElement manageexpense;
	 
	@FindBy(xpath="//p[text()=\"Expense Category\"]")
	WebElement excategory;
	
	@FindBy(xpath="//input[@name=\"name\"]")
	WebElement textboxnew;
	
	@FindBy(xpath="//button[@name=\"Create\"]")
	WebElement savebtn;
	
	@FindBy(xpath="//*[@id=\"srdiv\"]/div/div/div/div[2]/form/div/div[2]/a")
	WebElement resetbtn;
	
	@FindBy(xpath="//input[@id=\"un\"]")
	WebElement txtboxsearch;
	
	@FindBy(xpath="//button[@name=\"Search\"]")
	WebElement searchbutn;
	
	@FindBy(xpath="//a[@class=\"btn btn-sm btn btn-danger btncss\"]")
	WebElement delete;
	
	
	
	public ExpenseCategoryPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}
	public String getFontSize()
	{
		String size=elementUtil.fontsize(expensenewbtn);
		return size;
	}
	public String getIconColor()
	{
		String text=elementUtil.color(expensenewbtn);
		return text;
	}
	
	public boolean homePageElements()
	{
		boolean a=elementUtil.displayCheck(expensetext);
		return a;
	}
	
public String elementClick()
{
	
	elementUtil.click(manageexpense);
	waitUtil.waitForElementVisible(excategory);
	elementUtil.click(excategory);
	String text=elementUtil.color(expensenewbtn);
	return text;

	
}
	
	public void expenseCategoryNew()
	{
		
		waitUtil.waitForElementVisible(expensenewbtn);
		elementUtil.click(expensenewbtn);
		elementUtil.sendKeys(textboxnew, "test41");
		elementUtil.click(savebtn);
		
		
		
		
	
	}
	public void alertmsg()
	{
		String expect="Expense Category Created Successfully";
	    String actl=elementUtil.fetchAlertText();
	    Assert.assertEquals(actl,expect);
	}
	public void expenseCategorySearch()
    {
	elementUtil.click(expensesearchbtn);
	elementUtil.sendKeys(txtboxsearch, "test41");
	elementUtil.click(searchbutn);
	elementUtil.click(delete);
	elementUtil.acceptAlert();
	
	}
	public void expenseCategoryReset()
	{
		elementUtil.click(expenseresetbtn);
	}
	}

	
	


