package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.compareItemsPOM;
import pages.homePagePOM;

public class compareItemsStepDefinition {

	WebDriver driver;
	compareItemsPOM compare;

	@Given("user navigates to the home page of noPCommerce")
	public void user_navigates_to_the_home_page_of_no_p_commerce() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		compare = new compareItemsPOM(driver);

		driver.navigate().to(
				"https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();

		// to scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
	}

	@When("user clicks on compare button")
	public void user_clicks_on_compare_button() throws InterruptedException {
		Thread.sleep(1200);
		// to click on button
		compare.comparebtn().click();
	}

	@Then("item will be added to compare list successfully")
	public void item_will_be_added_to_compare_list_successfully() throws InterruptedException {
		Thread.sleep(1000);
		
		String actual = compare.comparemsg().getText();
		String expected = "The product has been added to your product comparison";
		
		System.out.println("PRINT THE ACTUALLLLL" + actual);
		
		assertTrue(actual.equals(expected));
	}
//
//	@After
//	public void closeDriver() {
//		driver.quit();
//	}

}
