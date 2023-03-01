package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pompages.ContactUsPage;
import pompages.CoreJavaForSeleniumPage;
import pompages.CoreJavaVideoPage;
import pompages.HomePage;
import pompages.SeleniumTrainingPage;
import pompages.SkillraryDemoAppPage;
import pompages.TestingPage;

public class BaseClass {
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected HomePage home;
	protected SkillraryDemoAppPage demoapp;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected CoreJavaForSeleniumPage corejava;
	protected CoreJavaVideoPage javavideo;
	protected ContactUsPage contact;
	protected WebDriver driver;
	
	//@BeforeSuite
	//@BeforeTest
	
	
	@BeforeClass
	public void classconfiguration() {
		property=new PropertiesUtility();
		 excel=new ExcelUtility();
	      web=new WebDriverUtility();
	   
	      property.propertiesInitialization (IConstantPath.PROPERTIES_FILE_PATH);
		excel.excelInitialization(IConstantPath.EXCEL_FILE_PATH);
	}
	@BeforeMethod
	public void classConfiguration() {
		long time = Long.parseLong(property.fetchProperty("timeouts"));
		driver=web.openAppplication(property.fetchProperty("browser"),property.fetchProperty("url"),time);
		
		home=new HomePage(driver);
		Assert.assertTrue(home.getLogo().isDisplayed());
		
		demoapp=new SkillraryDemoAppPage(driver);
		selenium=new SeleniumTrainingPage(driver);
		testing=new TestingPage(driver);
		corejava=new CoreJavaForSeleniumPage(driver);
		javavideo=new CoreJavaVideoPage(driver);
		contact=new ContactUsPage(driver);
	} 
	
	@AfterMethod
	public void methodTearDown() {
		web.quitBrowser();
	}
	@AfterClass
	public void classtearDown() {
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite

}
