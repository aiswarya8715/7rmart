package com.sevenrmart.qa.testcases;

import com.sevenrmart.qa.constants.Constants;
//import com.sevenrmart.qa.constants.Constants;
import com.sevenrmart.qa.pages.AdminUsersPage;
import com.sevenrmart.qa.pages.ExpenseCategoryPage;
import com.sevenrmart.qa.pages.LoginPage;
import com.sevenrmart.qa.pages.ManageCodPage;
import com.sevenrmart.qa.pages.ManageContactPage;
import com.sevenrmart.qa.pages.ManageDeliveryBoyPage;
import com.sevenrmart.qa.pages.ManageExpensePage;
import com.sevenrmart.qa.pages.ManageFooterPage;
import com.sevenrmart.qa.pages.ManageGroupPage;
import com.sevenrmart.qa.pages.ManageLocationPage;
import com.sevenrmart.qa.pages.ManageNewsPage;
import com.sevenrmart.qa.pages.ManageOfferCodePage;
import com.sevenrmart.qa.pages.ManageOrderPage;
import com.sevenrmart.qa.pages.ManagePagesPage;
import com.sevenrmart.qa.pages.ManagePaymentMethod;

import com.sevenrmart.qa.pages.ManageSliderPage;
import com.sevenrmart.qa.pages.ManageUsersPage;
import com.sevenrmart.qa.pages.MobileSliderPage;
import com.sevenrmart.qa.pages.PushNotificationPage;
import com.sevenrmart.qa.pages.VerifyUsersPage;
import com.sevenrmart.qa.utilities.ElementUtil;
import com.sevenrmart.qa.utilities.WaitUtil;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class BasePageTest {
	public WebDriver driver;
	ElementUtil elementUtil=new ElementUtil(driver);;
	WaitUtil waitUtil;
	public LoginPage loginPage;
	public ExpenseCategoryPage expensecategorypage;
	public ManageExpensePage manageexpensepage;
	public ManageOrderPage manageorderpage;
	public VerifyUsersPage verifyuserspage;
	public ManageUsersPage manageuserspage;
    public  PushNotificationPage pushnotificationpage;
    public ManagePagesPage managepagespage;
	public ManageFooterPage managefooterpage;
	public ManageContactPage managecontactpage;
	public ManageNewsPage managenewspage;
	public ManageLocationPage managelocationpage;
	public  ManageGroupPage managegrouppage;
	public ManageDeliveryBoyPage managedeliveryboypage;
	public ManagePaymentMethod managepaymentmethod;
	public ManageSliderPage managesliderpage;
	public MobileSliderPage mobilesliderpage;
	public AdminUsersPage adminuserspage;
	public  ManageOfferCodePage manageoffercodepage;
	public  ManageCodPage managecodpage;
	
	public String baseUrl=elementUtil.getApplicationUrl();
	public String urname=elementUtil.getUserName();
	public String pwd=elementUtil.getPassword();
	
	
	  
	  @Parameters("browser")
	 @ BeforeClass(alwaysRun=true)
	  public void setUp(@Optional("chrome")String browsername) {
		  String path=System.getProperty("user.dir");

			if(browsername.equals("chrome")) {

				System.setProperty("webdriver.chrome.driver", path+ ElementUtil.getPropertyValue("chromepath"));
				driver=new ChromeDriver();
			}else if((browsername.equals("edge"))) {

				System.setProperty("webdriver.edge.driver",path+ ElementUtil.getPropertyValue("edgepath"));
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get(baseUrl);
			elementUtil=new ElementUtil(driver);
			waitUtil=new WaitUtil(driver);
			 loginPage=new LoginPage(driver);
			 expensecategorypage=new ExpenseCategoryPage(driver);
			 manageexpensepage=new ManageExpensePage (driver);
			 manageorderpage=new ManageOrderPage(driver);
			 verifyuserspage=new VerifyUsersPage (driver);
			 manageuserspage=new  ManageUsersPage(driver);
			 pushnotificationpage=new PushNotificationPage(driver);
			 managepagespage=new ManagePagesPage(driver);
			 managefooterpage=new ManageFooterPage(driver);
			 managecontactpage=new ManageContactPage(driver);
			 managenewspage=new ManageNewsPage(driver);
			 managelocationpage=new ManageLocationPage(driver);
			 managegrouppage=new ManageGroupPage (driver);
			 managedeliveryboypage=new ManageDeliveryBoyPage(driver);
			 managepaymentmethod=new ManagePaymentMethod(driver);
			 managesliderpage=new ManageSliderPage(driver);
			 mobilesliderpage=new MobileSliderPage(driver);
			 adminuserspage=new AdminUsersPage(driver);
			 manageoffercodepage=new  ManageOfferCodePage(driver);
			 managecodpage=new  ManageCodPage(driver);
	  }
	  @AfterMethod
		public void takeScreenShotOnFailure(ITestResult iTestResult) throws IOException {
			if (iTestResult.getStatus() == iTestResult.FAILURE) {
				takeScreenShotOnFailure(iTestResult.getName());

			}
		}

		public String takeScreenShotOnFailure(String name) throws IOException {
			
			String dateName = new SimpleDateFormat("yyyy_MM_dd_hh_mm").format(new Date());
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String destination =Constants.screenShot_path + name+ dateName +".png";
			File finalDestination=new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;
		}
			 public void tearDown()
			  {
				  driver.quit();
			  }
		}
		
	//  @AfterClass
	 

	

