package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.homePagePOM;
import pages.loginPOM;

public class homeSlidersStepDefinition {
	WebDriver driver;
	homePagePOM homep;

	@Given("user goes to home")
	public void user_goes_to_home() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		homep = new homePagePOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
		
	}

	@When("user clicks on the first slider")
	public void user_clicks_on_the_first_slider() {
		homep.nokiaslider().click();
	}

	@Then("user navigates to nokia page")
	public void user_navigates_to_nokia_page() {
		String actualurl = driver.getCurrentUrl().toLowerCase();
	    String expectedtxt = "nokia";
	    assertTrue(actualurl.contains(expectedtxt));
		
	}
	
//	//////////////////// second scenario
	@Given("user goes to the page home")
	public void user_goes_to_the_page_home() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		homep = new homePagePOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
	}

	@When("user clicks on iPhone slider")
	public void user_clicks_on_i_phone_slider() {
		homep.iphoneButton().click();
	   homep.Iphoneslider().click();
	}

	@Then("user will be navigated to iphone pages")
	public void user_will_be_navigated_to_iphone_pages() {
		String actualurl = driver.getCurrentUrl().toLowerCase();
	    String expectedtxt = "iphone";
	    assertTrue(actualurl.contains(expectedtxt));
	}
	 
//	@After
//	public void closeDriver() {
//		driver.quit();
//	}
}

