package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.homePagePOM;
import pages.loginPOM;
import pages.resetPassPOM;

public class resetPassStepDefinition {
	WebDriver driver;
	resetPassPOM pass;
	loginPOM login;
	
	@Given("user navigates to the sites home page")
	public void user_navigates_to_the_sites_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		pass = new resetPassPOM(driver);
		login = new loginPOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");

		driver.manage().window().maximize();
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		login.logbtn().click();
	}

	@When("pass the email")
	public void pass_the_email() {
	    login.entermail().sendKeys("test@example.com");
	}
 
	@When("clicks on forget password")
	public void clicks_on_forget_password() {
	    pass.forgetPass().click();
	}

	@When("user enters his own email")
	public void user_enters_his_own_email() {
	    pass.resetpassEmail().sendKeys("test@example.com");
	}

	@When("clicks on recover button")
	public void clicks_on_recover_button() {
	    pass.recoverBtn().click();
	}

	@Then("a pop up message appears")
	public void a_pop_up_message_appears() {
		
		pass.closemsg().click();
		String expectedtxt = "Email with instructions has been sent to you.";
		String actualtxt = pass.popUp().getText();
		assertTrue(expectedtxt.equals(actualtxt));	
	}

	

}
