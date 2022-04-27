package com.sevenrmart.qa.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sevenrmart.qa.constants.Constants;

//import bsh.org.objectweb.asm.Constants;

public class WaitUtil {
	WebDriver driver;
	WebDriverWait wait;
	public WaitUtil(WebDriver driver)
	{
		this.driver=driver;
	}
public void waitForPageTitle(String title)
{
	wait=new WebDriverWait(driver,Duration.ofSeconds(100));
	wait.until(ExpectedConditions.titleIs(title));
}
public void waitForElementClick(WebElement element)
{
	wait=new WebDriverWait(driver,Duration.ofSeconds(100));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
	
}
public void waitForElementVisibility(WebElement element)
{
	wait=new WebDriverWait(driver,	Duration.ofSeconds(100));
	wait.until(ExpectedConditions.visibilityOfElementLocated((By)element));
	
}
public void waitForElementVisible(WebElement element)
{
	wait=new WebDriverWait(driver,Duration.ofSeconds(100));	
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void implicitWait()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT));
}
public void fluentWait()
{
	Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
	        .withTimeout(Duration.ofSeconds(30))
	        .pollingEvery(Duration.ofSeconds(5))
	        .ignoring(NoSuchElementException.class);
		
}

}


