package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.constants.Constants;
import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageOfferCodePage {
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public ManageOfferCodePage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[14]/a")
WebElement mangeoffercode;

@FindBy(xpath="/html/body/div/div[1]/section/div[1]/a[1]")
WebElement newbtn;

@FindBy(id="offer_code")
WebElement offercode;

@FindBy(name="type")
WebElement radio;

@FindBy(id="offer_per")
WebElement percentage;

@FindBy(id="offer_price")
WebElement price;

@FindBy(xpath="//div[@class=\"note-editable card-block\"]")
WebElement descript;

@FindBy(id="main_img")
WebElement choosefile;

@FindBy(name="create")
WebElement savebtn;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alrttext;

@FindBy(xpath="//h1[text()=\"List Offercodes\"]")
WebElement offercodetext;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement search;

@FindBy(name="un")
WebElement ofrcode;

@FindBy(name="Search")
WebElement serach2;

@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr/td[6]/a[2]")
WebElement delete;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-warning\"]")
WebElement reset;


public void offerCode()
{
	elementUtil.click(mangeoffercode);
	
	
}

public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck( offercodetext);
	return a;
}


public void newOfferCode()
{
	elementUtil.click(newbtn);
	elementUtil.sendKeys(offercode, "1234");	
	elementUtil.click(radio);
	elementUtil.sendKeys(percentage, "10");
	elementUtil.sendKeys(price, "50000");
	elementUtil.sendKeys(descript, "New Offer");
	choosefile.sendKeys(Constants.upload_file1);
	elementUtil.submit(savebtn);
	
}
public boolean alertText()
{
	boolean s=elementUtil.displayCheck(alrttext);
	return s;
	
}

public void searchOfferCode()
{
	elementUtil.click(mangeoffercode);
	elementUtil.click(search);
	elementUtil.sendKeys(ofrcode, "1234");
	elementUtil.click(serach2);
	elementUtil.click(delete);
	elementUtil.acceptAlert();
	elementUtil.click(reset);
}
}
