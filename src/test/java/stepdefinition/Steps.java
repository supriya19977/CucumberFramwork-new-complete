package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Loginpage;

public class Steps {
	
	public WebDriver driver;
	public Loginpage lp;
 
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	lp=new Loginpage(driver);
		

	}

	@When("I open orange hrm homepage")
	public void i_open_orange_hrm_homepage() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() throws InterruptedException {
		Thread.sleep(6000);
		boolean logo=driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']")).isDisplayed();
		Assert.assertEquals(true, logo);  

	}

	@Then("close browser")
	public void close_browser() {
		driver.close(); 

	}

	
	
}
