package stepDefintions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePagePOM;

public class followustwitterSteps {

	WebDriver driver;
	homePagePOM homep;

	// second scenario "Twitter"
	@And("user navigates to the first home page")
	public void user_navigates_to_the_first_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		homep = new homePagePOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
	}

	@When("user clicks on twitter link")
	public void user_clicks_on_twitter_link() {
	    homep.twitterlink().click();
	}

	@Then("he is navigated to twitter page")
	public void he_is_navigated_to_twitter_page() {
	    // navigates to this  "https://twitter.com/nopCommerce"
		ArrayList<String> ytTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ytTab.get(0));
	}
	
//	@After
//	public void closeDriver() {
//		driver.quit();
//	}
//	
}
