package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.loginPOM;
import pages.registerPOM;

public class negativeloginStepDefinition {

	WebDriver driver;
	loginPOM log;

//	@Given("user go to the login page")
//	public void user_go_to_the_login_page() {
//
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//
//		log = new loginPOM(driver);
//
//		driver.navigate().to(
//				"https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
//		driver.manage().window().maximize();
//
//		log.logbtn().click();
//	}
//
//	@When("user login with {string} {string} and {string}")
//	public void user_login_with_and(String string, String string2, String string3) {
//		log.entermail().sendKeys("wrong@example.com");
//		log.enterpass().sendKeys("P@ssw0rd");
//	}
//
//	@And("user press on the login button")
//	public void user_press_on_the_login_button() {
//		log.loginBtn().click();
//	}
//
//	@Then("user could not login to the system")
//	public void user_could_not_login_to_the_system() {
//		String expectedURl = "https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM";
//		String currUrl = driver.getCurrentUrl();
//
//		assertTrue(expectedURl.equals(currUrl));
//
//		assertTrue(log.accDisplay().isDisplayed());
//	}
//
//	@After
//	public void closeDriver() {
//		driver.quit();
//	}

}
