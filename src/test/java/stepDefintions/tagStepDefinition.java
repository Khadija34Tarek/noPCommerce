package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.homePagePOM;
import pages.tagsPOM;

public class tagStepDefinition {
	WebDriver driver;
	tagsPOM tags;
	
	@Given("user navigate to any product page")
	public void user_navigate_to_any_product_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		tags = new tagsPOM(driver);
		
		driver.navigate().to("https://demo.nopcommerce.com/shoes");
		driver.manage().window().maximize();
		
	}

	@When("user scrolls down")
	public void user_scrolls_down() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
	}

	@And("clicks on a specific tag")
	public void clicks_on_a_specific_tag() {
	   tags.choosetag().click();
	}

	@Then("the tag will be applied on the page")
	public void the_tag_will_be_applied_on_the_page() {
	  String expected = "Products tagged with 'apparel'";
	  String actual = tags.tagapplied().getText();
	  assertTrue(actual.equals(expected));
	}

//	@After
//	public void closeDriver() {
//		driver.quit();
//	}
	
}
