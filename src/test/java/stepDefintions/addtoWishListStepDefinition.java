package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.addtoCartPOM;
import pages.addtoWishListPOM;
import pages.homePagePOM;

public class addtoWishListStepDefinition {
	WebDriver driver;
	addtoWishListPOM wishlist;
	addtoCartPOM cart;

	@Given("user navigates to the home page of the website")
	public void user_navigates_to_the_home_page_of_the_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		wishlist = new addtoWishListPOM(driver);
		cart = new addtoCartPOM(driver);

		driver.navigate().to(
				"https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();

	}

	@When("user scrolls down and clicks on heart icon")
	public void user_scrolls_down_and_clicks_on_heart_icon() throws InterruptedException {
		// to scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");

		Thread.sleep(1000);	
		
		// to click on heart icon
		wishlist.heart().click();
		
	}

	@And("chooses the RAM and HDD he wants")
	public void chooses_the_ram_and_hdd_he_wants() throws InterruptedException {
		// to select ram and hdd
		//cart.selectram().click();
		Thread.sleep(1000);	
		cart.selectram().selectByValue("3");
		cart.HDD().click();
	}

	@And("clicks on add to wish list button")
	public void clicks_on_add_to_wish_list_button() throws InterruptedException {
		Thread.sleep(1000);	
		wishlist.heartProduct().click();
		Thread.sleep(1000);
	}

	@Then("product will be added successfully to wishList")
	public void product_will_be_added_successfully_to_wish_list() throws InterruptedException {
		Thread.sleep(1000);
		String actualtxt = wishlist.wishListmsg().getText();
		String expectedtext = "The product has been added to your wishlist";
		assertTrue(actualtxt.equals(expectedtext));
	}

//	@After
//	public void closeDriver() {
//		driver.quit();
//	}
}
