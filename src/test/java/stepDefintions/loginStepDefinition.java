package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.loginPOM;
import pages.registerPOM;

public class loginStepDefinition {
	
	static WebDriver driver;
	loginPOM log;
	
	@Given("user go to login page")
	public void user_go_to_login_page() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		//driver = registerStepDefinition.getDriver();
		driver = new ChromeDriver();
		
		log = new loginPOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
		
		log.logbtn().click();
		
	}

	@When("user login with {string} {string} and {string}")
	public void user_login_with_and(String string, String string2, String string3) {
	    log.entermail().sendKeys("test4@example.com");
	    log.enterpass().sendKeys("P@ssw0rd");
	}
 
	@And("user press on login button")
	public void user_press_on_login_button() {
	   log.loginBtn().click();
	}

	@Then("user login to the system successfully")
	public void user_login_to_the_system_successfully() {
	   String expectedURl = "https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM";
	   String currUrl = driver.getCurrentUrl();
	   
	   System.out.println("current = " +currUrl);
	   
	   assertTrue(expectedURl.equals(currUrl));
	   
	   
	   assertTrue(log.accDisplay().isDisplayed());
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
//	@After
//	public void closeDriver() {
//		driver.quit();
//	}

}
