package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePagePOM;

public class SkuSearchStepDefinition {

	WebDriver driver;
	homePagePOM homep;
	
	/// second scenario ///
	@Given("user navigates to the page home")
	public void user_navigates_to_the_page_home() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		homep = new homePagePOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
	}

	@When("user clicks on search bar")
	public void user_clicks_on_search_bar() {
	   homep.searchBar().click();
	}

	@And("search for a product {string}")
	public void search_for_a_product(String string) throws InterruptedException {
		Thread.sleep(1000);
		homep.searchBar().sendKeys(string);
		
		Thread.sleep(5000);
		homep.searchSku().click();
		
		Thread.sleep(1000);
	}

	@Then("user will navigates to the results {string} page successfully")
	public void user_will_navigates_to_the_results_page_successfully(String string) throws InterruptedException {
//	    String Expected = "https://demo.nopcommerce.com/apple-icam";
//	    String Current = driver.getCurrentUrl();
//	    assertTrue(Expected.equals(Current));
		
		String Expected = "SKU: " + string;
		Thread.sleep(1000);
	    //String Current = homep.skuassertion().getText();
	    String Current = homep.sciFaith().getText();

	    
	   // System.out.println(Current);
	    assertTrue(Expected.equals(Current));
	}
}

