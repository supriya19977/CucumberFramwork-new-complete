package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
public WebDriver ldriver;

public Loginpage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
@FindBy(name="username")
@CacheLookup
WebElement txtEmail;

@FindBy(name="password")
@CacheLookup
WebElement txtpassword;

@FindBy(xpath="//div[@class='orangehrm-login-logo']/img[@src='/web/images/ohrm_logo.png']")
@CacheLookup
WebElement  loginbutton;

public void setUserName(String uname) {
	txtEmail.clear();
	txtEmail.sendKeys(uname);
}

public void setPassword(String pwd) {
	txtpassword.clear();
	txtpassword.sendKeys(pwd);
}
}
