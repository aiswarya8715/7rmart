package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageLocationPage {
	
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public  ManageLocationPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="//p[text()=\"Manage Location\"]")
WebElement managelocation;

@FindBy(xpath="//h1[text()=\"List Locations\"]")
WebElement listlocationtext;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")
WebElement newbtn;


@FindBy(id="country_id")
WebElement country;


@FindBy(id="st_id")
WebElement state;


@FindBy(id="location")
WebElement location;
 

@FindBy(id="delivery")
WebElement delivery;


@FindBy(name="create")
WebElement savebtn;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement searchbtn;

@FindBy(name="Search")
WebElement searchbtn1;

@FindBy(xpath="//input[@class=\"form-control\"]")
WebElement loc;

@FindBy(name="state_id")
WebElement statenew;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alerttext;

@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[6]/a[2]")
WebElement delete;

public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(listlocationtext);
	return a;
}

public void manageLocation()
{
	elementUtil.click(managelocation);
	
	}
public void newLocation()
{
	elementUtil.click(newbtn);
	elementUtil.selectDropdown(country, "index", "1");
	elementUtil.selectDropdown(state, "index", "1");
	elementUtil.sendKeys(location, "City10");
	elementUtil.sendKeys(delivery, "5000");
	elementUtil.click(savebtn);
}

public boolean alertText()
{
	boolean s=elementUtil.displayCheck(alerttext);
	return s;
}
public void searchLocation()
{
	
	
	elementUtil.click(managelocation);
	elementUtil.click(searchbtn);
	elementUtil.click(country);
	elementUtil.selectDropdown(country, "index", "1");
	waitUtil.waitForElementVisible(state);
	elementUtil.click(state);
	elementUtil.selectDropdown(statenew, "index", "1");
	waitUtil.waitForElementVisible(loc);
	elementUtil.sendKeys(loc, "City10");
	elementUtil.submit(searchbtn1);
	elementUtil.click(alerttext);
	
	
}

}

