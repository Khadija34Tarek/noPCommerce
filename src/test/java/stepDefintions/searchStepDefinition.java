package stepDefintions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.homePagePOM;
import pages.loginPOM;

public class searchStepDefinition {

	WebDriver driver;
	homePagePOM homep;
	
	@Given("user navigates to the home page")
	public void user_navigates_to_the_home_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		homep = new homePagePOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
		
	}

	@When("user clicks on the search bar")
	public void user_clicks_on_the_search_bar() {
		homep.searchBar().click();
	}

	@And("search for {string}")
	public void search_for(String string) {
		homep.searchBar().sendKeys(string);
	}

	@And("press on search button")
	public void press_on_search_button() {
		homep.searchBtn().click();
	}

	@Then("user navigates to results {string} page successfully")
	public void user_navigates_to_results_page_successfully(String string) {
//		String url = driver.getCurrentUrl();
//		String Expected = "https://demo.nopcommerce.com/search?q=book";
//		assertTrue(Expected.equals(url));
		
		List<WebElement> ele = homep.searchDisplayed();
		for(int i = 0; i <ele.size(); i++) {
			String actual = ele.get(i).getText().toLowerCase(); 
			String expected = string;
			System.out.println("search details" + actual);
			
			assertTrue(actual.contains(expected));
		}
		
		
		
	}

	
	
}
