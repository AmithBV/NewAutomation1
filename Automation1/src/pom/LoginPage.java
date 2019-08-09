package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage{
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un){
		userName.sendKeys(un);
	}
	
	public void setPassword(String pw){
		password.sendKeys(pw);
	}
	
	public void login(){
		loginbutton.click();
	}
	
	public void verifyErrMsgDisplayed(){
		Assert.assertTrue(errMsg.isDisplayed());
	}

}
