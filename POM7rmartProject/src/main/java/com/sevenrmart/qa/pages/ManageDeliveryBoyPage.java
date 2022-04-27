package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageDeliveryBoyPage {
	
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public ManageDeliveryBoyPage (WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}
@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[16]/a")
WebElement managedelboy;

@FindBy(xpath="//h1[text()=\"List Delivery Boy\"]")
WebElement listdeliverytext;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")
WebElement newbtn;

@FindBy(id="name")
WebElement name;

@FindBy(id="email")
WebElement email;

@FindBy(id="phone")
WebElement phone;

@FindBy(id="address")
WebElement address;

@FindBy(id="username")
WebElement username;

@FindBy(id="password")
WebElement pwd;

@FindBy(name="create")
WebElement savebtn;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alertsubmit;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement search;

@FindBy(name="un")
WebElement name1;


@FindBy(name="ut")
WebElement email2;


@FindBy(name="ph")
WebElement phn2;


@FindBy(xpath="//button[@class=\"btn btn-block-sm btn-danger\"]")
WebElement search2;

@FindBy(xpath="//a[@class=\"btn btn-sm btn btn-danger btncss\"]")
WebElement delete;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alertmsg;



public void managedel()
{
	elementUtil.click(managedelboy);
}
	
public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck( listdeliverytext);
	return a;
}
public String getFontSize()
{
	String size=elementUtil.fontsize(newbtn);
	return size;
}
public String getIconColor()
{
	String text=elementUtil.color(newbtn);
	return text;
}
public void newDelivery()
{
	elementUtil.click(newbtn);
	elementUtil.sendKeys(name, "Aadithyan");
	elementUtil.sendKeys(email, "adn@gmail.com");
	elementUtil.sendKeys(phone, "9895668822");
	elementUtil.sendKeys(address,"Tvm");
	elementUtil.sendKeys(username, "adn");
	elementUtil.sendKeys(pwd, "123");
	elementUtil.submit(savebtn);
	elementUtil.displayCheck(alertsubmit);
	System.out.println("Delivery boy added successfully");
	
}

public void searchDeliBoy()
{
	elementUtil.click(search);
	elementUtil.sendKeys(name1, "Aadithyan");
	elementUtil.sendKeys(email2, "adn@gmail.com");
	elementUtil.sendKeys(phn2, "9895668822");
	elementUtil.submit(search2);
	elementUtil.click(delete);
	elementUtil.acceptAlert();
	elementUtil.displayCheck(alertmsg);
	System.out.println("Deleted successfully");

	
}


}

