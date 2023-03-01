package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageHeader;
	@FindBy(xpath="//img[@id='java']")
	private WebElement javaImg ;
	@FindBy(id="cartArea")
	private WebElement myCartArea ;
	@FindBy(xpath="//footer/descendant::i[@class='fa fa-facebook']")
	private WebElement faceBookIcon;
	
	//initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
		}
	public WebElement getJavaIMG() {
		return javaImg;
	}
	public WebElement getMyCartArea() {
		return myCartArea;
	}
	public WebElement getFaceBookIcon() {
		return faceBookIcon;  
	}
	public void clickFacebookIcon() {
		faceBookIcon.click();
	}
	
	

}
