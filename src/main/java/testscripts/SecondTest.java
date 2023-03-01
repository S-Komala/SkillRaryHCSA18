package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class SecondTest  extends BaseClass{
	@Test
	public void secondTest() {
		SoftAssert soft=new SoftAssert();
		home.clickGears();
		home.clickskillraryDemoApp();
		//Switch to Child browser
		web.switchToChildBrowser();
		
		soft.assertEquals(demoapp.getPageHeader(),"SkillRary-ECommerce");
		demoapp.selectCategory(web,1);
		
		soft.assertEquals(testing.getPageHeader(),"Testing");
		
		web.dragAndDropElement(testing .getJavaIMG(),testing.getMyCartArea());
		web.scrollToElement(testing.getFaceBookIcon());
		testing.clickFacebookIcon();
		
		soft.assertAll();
	}

}
