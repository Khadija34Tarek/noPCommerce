package stepDefintions;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.addtoCartPOM;
import pages.addtoWishListPOM;

public class addtoCartStepDefinition {

	static WebDriver driver;
	addtoCartPOM addcart;

	@Given("user goes to website homepage")
	public void user_goes_to_website_homepage() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = loginStepDefinition.getDriver();

		addcart = new addtoCartPOM(driver);

		driver.navigate().to(
				"https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();
	}

	@When("user scrolls down and clicks on add to cart")
	public void user_scrolls_down_and_clicks_on_add_to_cart() throws InterruptedException {
		// to scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)", "");
		
		Thread.sleep(1000);	
		
		addcart.addtocart().click();
		
		Thread.sleep(1000);	
	}

	@When("user chooses Ram and HDD")
	public void user_chooses_ram_and_hdd() throws InterruptedException {
		// to select ram and hdd
		Thread.sleep(1000);	
		addcart.selectram().selectByValue("3");
		addcart.HDD().click();
		Thread.sleep(1000);
	}

	@When("clicks on add to cart button")
	public void clicks_on_add_to_cart_button() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");
		
		Thread.sleep(1000);	
		
			
		addcart.addproduct().click();
		Thread.sleep(1000);
	}

	@Then("product will be successfully added")
	public void product_will_be_successfully_added() throws InterruptedException {
		Thread.sleep(1000);
		
		String Expectedmsg = "The product has been added to your shopping cart";
		String actualmsg = addcart.successmsg().getText();
		
		
		assertTrue(Expectedmsg.equals(actualmsg));
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
//	@After
//	public void closeDriver() {
//		driver.quit();
//	}

}
