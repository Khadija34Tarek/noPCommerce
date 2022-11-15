package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.homePagePOM;
import pages.registerPOM;

public class hoverCategoriesStepDefinition {
	WebDriver driver;
	homePagePOM homep;
	
	@Given("user navigates to home page")
	public void user_navigates_to_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		homep = new homePagePOM(driver);
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");

		driver.manage().window().maximize();
	}

	@When("user hovers over computers")
	public void user_hovers_over_computers() {
	   Actions act = new Actions(driver);
	   act.moveToElement(homep.compHover()).perform();
	}

	@When("clicks on desktop as sub category")
	public void clicks_on_desktop_as_sub_category() {
	   homep.deskHover().click();
	}

	@Then("user is navigated successfully to the page")
	public void user_is_navigated_successfully_to_the_page() {
		String ExpectedText = "desktops";
		String ActualTxt = homep.desktop().getText().toLowerCase();
	   assertTrue(ExpectedText.equals(ActualTxt));
	}
	
//	@After
//	public void closeDriver() {
//		driver.quit();
//	}

	
	
}
