package stepDefintions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.homePagePOM;

public class followUsStepDefinition {
	
	WebDriver driver;
	homePagePOM homep;
	
	// first scenario facebook
	@Given("user opens first page")
	public void user_opens_first_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		homep = new homePagePOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
	}

	@When("user clicks on facebook link")
	public void user_clicks_on_facebook_link() {
	    homep.fbLink().click();
	}

	@Then("user is navigated to facebook page")
	public void user_is_navigated_to_facebook_page() {
		// navigates to this "https://www.facebook.com/nopCommerce" 
		ArrayList<String> ytTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(ytTab.get(0));
	}

//	@After
//	public void closeDriver() {
//		driver.quit();
//	}
//	

}
