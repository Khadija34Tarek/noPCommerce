package stepDefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.addtoCartPOM;
import pages.colourFilterPOM;

public class colourFilterStepDefinition {
	
	WebDriver driver;
	colourFilterPOM filter;
	
	@Given("user navigates to home")
	public void user_navigates_to_home() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		filter = new colourFilterPOM(driver);

		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
	}

	@When("user hovers over apparel and clicks on shoes")
	public void user_hovers_over_apparel_and_clicks_on_shoes() {
	    Actions hover = new Actions(driver);
	   hover.moveToElement(filter.apparel()).perform();
	   
	   filter.shoes().click();
	}

	@And("chooses the filter")
	public void chooses_the_filter() {
	    filter.colourfilter().click();
	}

	@Then("filter will be applied successfully")
	public void filter_will_be_applied_successfully() {
	   
	}

//	@After
//	public void closeDriver() {
//		driver.quit();
//	}
	
}
