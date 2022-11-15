package stepDefintions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePagePOM;

public class followusYoutubeSteps {
	
	WebDriver driver;
	homePagePOM homep;
	
	// fourth scenario "Youtube"
	@Given("user navigates to the website first page")
	public void user_navigates_to_the_website_first_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		homep = new homePagePOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
	}

	@When("he clicks on the link")
	public void he_clicks_on_the_link() {
	   homep.youtube().click();
	}

	@Then("he goes to that page")
	public void he_goes_to_that_page() {
	   // navigates to this "https://www.youtube.com/user/nopCommerce" 
		ArrayList<String> ytTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ytTab.get(0));
		// 0 means first tab, 1 means second tab and so on 
	}

//	@After
//	public void closeDriver() {
//		driver.quit();
//	}
	
}
