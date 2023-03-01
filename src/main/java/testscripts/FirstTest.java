package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class FirstTest extends BaseClass{
	@Test
	  public void firsttest() {
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickskillraryDemoApp();
		web.switchToChildBrowser();
		
		soft.assertEquals(demoapp.getPageHeader(),"SkillRary-ECommerce");
		demoapp.mouseHoverToCourse(web);
		demoapp.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
		selenium.doubleClickPlusButton(web);
		selenium.clickAddToCart();
		web.handAlert();
		
		soft.assertTrue(selenium.getItemAddedToMessage().isDisplayed());
		soft.assertAll();
	}
	}


