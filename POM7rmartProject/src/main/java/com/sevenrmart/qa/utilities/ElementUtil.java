package com.sevenrmart.qa.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import com.sevenrmart.qa.constants.Constants;

public class ElementUtil {

	
		
		WebDriver driver;
		static Properties pro=new Properties();
		public ElementUtil(WebDriver driver)
		{
			this.driver=driver;
			File src=new File(Constants.propertyConfig_File);

			try {
				FileInputStream fis=new FileInputStream(src);
				pro=new Properties();
				pro.load(fis);

			} catch (Exception e) {
				System.out.println("Exception is "+e.getMessage());
			}
		}
		public static String getPropertyValue(String key)
		{

			String propertyFile=System.getProperty("user.dir")+"/Configuration/config.properties";
			FileInputStream fis=null;
			try {
				fis = new FileInputStream (propertyFile);
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			}
			try {
				pro.load(fis);
			} catch (IOException e) {

				e.printStackTrace();
			}
			String value=pro.get(key).toString();
			return value;
		}
		
public String getApplicationUrl()
{
	String url=pro.getProperty("baseUrl");
	return url;
}
public String getUserName()
{
	String userName=pro.getProperty("username");
	return userName;
}
	
	public String getPassword()
	{
		String Password=pro.getProperty("password");
		return Password;
	}
	
	public void sendKeys(WebElement element,String value)
	{
		element.clear();
		element.sendKeys(value);
	}
	public void click(WebElement element)
	{
		element.click();
	}
	public void submit(WebElement element)
	{
		element.submit();
	}
	public void acceptAlert()
	{
		Alert al=driver.switchTo().alert();
		al.accept();
	}
	public void dismissAlert()
	{
		Alert al=driver.switchTo().alert();
		al.dismiss();
	}
	public String color(WebElement element)
	{
		String text=element.getCssValue("background-color");
		String hextext=Color.fromString(text).asHex();
		return hextext;
	}
	public String fontsize(WebElement element)
	{
		String size=element.getCssValue("font-size");
		return size;
	}
	public String fetchAlertText()
	{
		Alert al=driver.switchTo().alert();
		String h=al.getText();
		return h;
	}
	public void mouseHover(WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	public void doubleClick(WebElement element)
	{
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	public void navigateBack()
	{
		driver.navigate().back();
	}
	public void scrollUp(WebElement element)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500", element);
		
	}
	public void scrollDown(WebElement element)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(500,0", element);
		
	}
	public void selectDropdown(WebElement element,String type,String value)
	{
		Select s=new Select(element);
		switch(type)
		{
		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;
		case "visibletext":
			s.selectByVisibleText(value);
			break;
		case "byvalue":
			s.selectByValue(value);
			break;
		
	}
	}
	
	public boolean displayCheck(WebElement element)
	{
		boolean en=element.isDisplayed();
		return en;
	}

	public boolean enbleCheck(WebElement element)
	{
		boolean en=element.isEnabled();
		return en;
	}
	public void newTab() throws AWTException
	{
		 Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_T);
          r.keyRelease(KeyEvent.VK_CONTROL);
          r.keyRelease(KeyEvent.VK_T);
	}
	public void keyPressing() throws AWTException
	{
		 Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_CONTROL);
	}
	public void keyReleasing() throws AWTException
	{
		 Robot r=new Robot();
		  r.keyRelease(KeyEvent.VK_CONTROL);
	}
	public void dragDrop(WebElement element1,WebElement element2)
	{
		 Actions act=new Actions(driver);
		  act.dragAndDrop(element1, element2);
		  act.build().perform();
	}
	
	}

