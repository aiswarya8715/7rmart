package com.sevenrmart.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;

public class LoginPage {
	WebDriver driver;
	ElementUtil elementUtil;
	WaitUtil waitUtil;
	
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@src=\"https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png\"]")
	WebElement adminlogo;
	
	@FindBy(xpath="//b[text()=\"7rmart supermarket\"]")
	WebElement logintext;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtil=new ElementUtil(driver);
		waitUtil=new WaitUtil(driver);
	}
	public boolean homePageElements()
	{
		boolean a=elementUtil.displayCheck(adminlogo);
		return a;
	}
	public String loginPageText()
	{
	String text=logintext.getText();
	return text;
	}
	public void loginAction(String urname,String pwd)
	{
		elementUtil.sendKeys( username,urname);
		elementUtil.sendKeys( password,pwd);
		waitUtil.waitForElementClick(loginBtn);
		elementUtil.click(loginBtn);
	}
}
