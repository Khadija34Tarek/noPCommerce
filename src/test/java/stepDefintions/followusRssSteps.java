package stepDefintions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePagePOM;

public class followusRssSteps {

	WebDriver driver;
	homePagePOM homep;
	
	// third scenario "RSS"
	@Given("user navigates to the page")
	public void user_navigates_to_the_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		homep = new homePagePOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
	}

	@When("user clicks on rss link")
	public void user_clicks_on_rss_link() {
		homep.rssLink().click();
	}

	@Then("user is navigated to page rss")
	public void user_is_navigated_to_page_rss() {
	   // navigates to this "https://demo.nopcommerce.com/new-online-store-is-open" 
		ArrayList<String> ytTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ytTab.get(0));
	}

//	@After
//	public void closeDriver() {
//		driver.quit();
//	}
//	

	
}
