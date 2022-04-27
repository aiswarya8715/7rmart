package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.constants.Constants;
import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class ManageExpensePage {
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public ManageExpensePage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}

@FindBy(xpath="/html/body/div/aside[1]/div/div[4]/div/div/nav/ul/li[2]/a/p")
WebElement manageexp;

@FindBy(xpath="//p[text()=\"Manage Expense\"]")
WebElement dropmanageexpnse;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-danger\"]")
WebElement manexpnewbtn;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement manexpsearchbtn;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-warning\"]")
WebElement manexpresetbtn;

@FindBy(xpath="//h1[text()=\"List Expense\"]")
WebElement listexpensetxt;

@FindBy(xpath="//select[@name=\"user_id\"]")
WebElement drpuser;

@FindBy(xpath="//*[@id=\"ex_cat\"]")
WebElement drpcat;

@FindBy(xpath="//*[@id=\"order_id\"]")
WebElement drporder;

@FindBy(xpath="//*[@id=\"purchase_id\"]")
WebElement drppid;

@FindBy(xpath="//select[@name=\"ex_type\"]")
WebElement drpextype;

@FindBy(xpath="//input[@name=\"amount\"]")
WebElement amount;

@FindBy(xpath="//textarea[@name=\"remarks\"]")
WebElement remarks;

@FindBy(xpath="//button[@name=\"create\"]")
WebElement savebtn;

@FindBy(xpath="//a[@class=\"btn btn-default btn-fix\"]")
WebElement cancelbtn;

@FindBy(xpath="//input[@name=\"userfile\"]")
WebElement uploadbtn;;

@FindBy(name="ex_date")
WebElement date;

@FindBy(xpath="//a[@class=\"btn btn-rounded btn-primary\"]")
WebElement search;

@FindBy(name="um")
WebElement searchusers;

@FindBy(xpath="//input[@id=\"ti\"]")
WebElement searchtitle;

@FindBy(xpath="//select[@name=\"um\"]")
WebElement searchcat;

@FindBy(xpath="//select[@name=\"ty\"]")
WebElement searchextype;

@FindBy(name="od")
WebElement searchorderid;

@FindBy(name="pi")
WebElement searchpid;

@FindBy(xpath="//input[@name=\"f_dat\"]")
WebElement fdate;

@FindBy(xpath="//input[@name=\"t_dat\"]")
WebElement tdate;

@FindBy(xpath="//button[@name=\"Search\"]")
WebElement searchBtn;

@FindBy(xpath="/html/body/div/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[9]/a[2]")
WebElement delete;
//@FindBy(xpath="")
//WebElement reprtBtn;

@FindBy(xpath="//a[@class=\"btn btn-default btn-fix\"]")
WebElement resetBtn;

@FindBy(xpath="//a[@class=\"btn btn-default btn-fix\"]")
WebElement searchreset;

@FindBy(xpath="//div[@class=\"alert alert-success alert-dismissible\"]")
WebElement alert;

public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(listexpensetxt);
	return a;
}

public void manageAction()
{
	
	elementUtil.click(manageexp);
	waitUtil.waitForElementVisible(dropmanageexpnse);
	elementUtil.click(dropmanageexpnse);
	
}
public String getFontSize()
{
	String size=elementUtil.fontsize(manexpnewbtn);
	return size;
}
public String getIconColor()
{
	String text=elementUtil.color(manexpnewbtn);
	return text;
}
public void manangeoperation() 
{
	elementUtil.click(manexpnewbtn);
	waitUtil.waitForElementVisible(drpuser);
	elementUtil.click(drpuser);
	elementUtil.selectDropdown(drpuser, "index", "5");
	
	elementUtil.sendKeys(date, "April 2022");
	waitUtil.waitForElementVisible(drpcat);
	elementUtil.click(drpcat);
	elementUtil.selectDropdown(drpcat, "index", "2");
	waitUtil.waitForElementVisible(drporder);
	elementUtil.click(drporder);
	elementUtil.selectDropdown(drporder,"index","2");
	waitUtil.waitForElementVisible(drppid);
	elementUtil.click(drppid);
	elementUtil.selectDropdown(drppid,"index","6");
	waitUtil.waitForElementVisible(drpextype);
	 elementUtil.click(drpextype);  
	elementUtil.selectDropdown(drpextype,"index","1");
   
	elementUtil.sendKeys(amount, "2500");
	elementUtil.sendKeys(remarks, "better option");
	waitUtil.waitForElementVisible(uploadbtn);
	uploadbtn.sendKeys(Constants.upload_file);
	waitUtil.waitForElementVisible(savebtn);
}
public void confirmAction()
{
	
	elementUtil.submit(savebtn);
	elementUtil.click(dropmanageexpnse);
	//elementUtil.click(cancelbtn);

}
public void searchAction()
{
	waitUtil.waitForElementVisible(search);
	elementUtil.click(search);
	waitUtil.waitForElementVisible(searchusers);
	elementUtil.click(searchusers);
	elementUtil.selectDropdown(searchusers, "index", "5");
	
	elementUtil.sendKeys(searchtitle, "NewYear expense");
	waitUtil.waitForElementVisible(searchcat);
	elementUtil.click(searchcat);
	elementUtil.selectDropdown(searchcat, "index", "2");
	waitUtil.waitForElementVisible(searchextype);
	elementUtil.click(searchextype);
	elementUtil.selectDropdown(searchextype, "index", "1");
	waitUtil.waitForElementVisible(searchorderid);
	elementUtil.click(searchorderid);
	elementUtil.selectDropdown(searchorderid, "index", "2");
	elementUtil.click(searchpid);
	elementUtil.selectDropdown(searchpid, "index", "6");
	elementUtil.sendKeys(tdate,"01-04-2022");
	elementUtil.sendKeys(fdate, "30-04-2022");
	waitUtil.waitForElementClick(searchBtn);
	elementUtil.submit(searchBtn);
	//waitUtil.waitForElementClick(reprtBtn);
	//elementUtil.submit(reprtBtn);
	//waitUtil.waitForElementClick(searchreset);
	//elementUtil.click(searchreset);
	elementUtil.click(delete);
	elementUtil.acceptAlert();
}
public boolean alertText()
{
	boolean b=elementUtil.displayCheck(alert);
	return b;
}
}






