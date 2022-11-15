package stepDefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.registerPOM;

public class registerStepDefinition {
	static WebDriver driver;
	registerPOM reg;

	@Given("user goes to register page")
	public void user_goes_to_register_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		reg = new registerPOM(driver);
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		
		// to click on the register button
		reg.registerBPOM().click();
		driver.manage().window().maximize();
	}

	@When("user select gender type")
	public void user_select_gender_type() {
	   reg.genderPOM().click();
	}

	@And("user enters first name {string} and last name {string}")
	public void user_enters_first_name_and_last_name(String string, String string2) {
	   reg.fnamePOM().sendKeys("automation");
	   reg.lnamePOM().sendKeys("tester");
	}

	@And("user enter date of birth")
	public void user_enter_date_of_birth() {
	   reg.dayDOBPM().selectByValue("2");
	   reg.monthDOBPM().selectByValue("3");
	   reg.yearDOBPM().selectByValue("1996");
	}

	@And("user enter email {string} field")
	public void user_enter_email_field(String string) {
	   reg.emailPOM().sendKeys("test4@example.com");
	}

	@And("user fills the password fields {string} \"P@ssw0rd")
	public void user_fils_the_password_fields_p_ssw0rd(String string) {
	    reg.passPOM().sendKeys("P@ssw0rd");
	    reg.confpassPOM().sendKeys("P@ssw0rd");
	}

	@And("user clicks on register button")
	public void user_clicks_on_register_button() {
		reg.registerbtnPOM().click();
	}

	@Then("success message is displayed")
	public void success_message_is_displayed() {
	    reg.msgPOM().isDisplayed();
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
//	@After
//	public void closeDriver() {
//		driver.quit();
//	}
}
