package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class PushNotificationPage {

	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
public  PushNotificationPage(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}
@FindBy(xpath="//p[text()=\"Push Notifications\"]")
WebElement pushnotification;

@FindBy(name="titlep")
WebElement title;

@FindBy(name="description")
WebElement descript;

@FindBy(xpath="//button[@name=\"create\"]")
WebElement sendBtn;
 @FindBy(xpath="//h1[@class=\"m-0 text-dark\"]")
WebElement pushnotitext;

@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]")
WebElement alert;

@FindBy(xpath="//a[@class=\"btn btn-default btn-fix\"]")
WebElement reset;

public void pushNotification()
{
	elementUtil.click(pushnotification);
	
}
public boolean homePageElements()
{
	boolean a=elementUtil.displayCheck(pushnotitext);
	return a;
}
public boolean displayCheck()
{
	boolean en=alert.isDisplayed();
	return en;
}

public void newNotification()
{
	elementUtil.sendKeys(title, "test");
	elementUtil.sendKeys(descript, "new data");
	elementUtil.click(sendBtn);
	elementUtil.click(reset);
}
}
