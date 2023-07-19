package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.HRMLoginpage;
import pageobjects.Logopage;

public class Loginpage {
	
	public WebDriver driver;
	public HRMLoginpage lp;

	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		lp=new HRMLoginpage(driver);
	    
	}

	@When("User open URL")
	public void user_open_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter username as {string} and password as {string}")
//	public void user_enter_username_as_and_password_as(String string, String string2) {
		public void user_enter_username_as_and_password_as(String uname, String pwd) throws InterruptedException {
	   Thread.sleep(5000); 
		lp.setUserName(uname);
		lp.setPassword(pwd);
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
		Thread.sleep(5000); 
		driver.close();
	    
	}


}
