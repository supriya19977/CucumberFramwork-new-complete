package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRMLoginpage  {

	public WebDriver ldriver;

	public HRMLoginpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="username")
	@CacheLookup
	WebElement uname1;

	@FindBy(name="password")
	@CacheLookup
	WebElement pwd1;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	@CacheLookup
	WebElement Login;
	
	public void setUserName(String uname) {
		uname1.clear();
		uname1.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		pwd1.clear();
		pwd1.sendKeys(pwd);
	}
	}

