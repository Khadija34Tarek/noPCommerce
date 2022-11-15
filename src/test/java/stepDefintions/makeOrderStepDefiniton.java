package stepDefintions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.homePagePOM;
import pages.makeOrderPOM;

public class makeOrderStepDefiniton {

	WebDriver driver;
	makeOrderPOM order;

	@Given("user navigates to shopping cart")
	public void user_navigates_to_shopping_cart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
		driver = addtoCartStepDefinition.getDriver();
//		driver = new ChromeDriver();
		
		order = new makeOrderPOM(driver);
		driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
		driver.manage().window().maximize();

		Thread.sleep(1000);	
		order.shoppingcart().click();
		Thread.sleep(1000);	

	}

	@And("user check on terms check box")
	public void user_check_on_terms_check_box() throws InterruptedException {
		Thread.sleep(1000);
		order.terms().click();
	}

	@And("clicks on checkout button")
	public void clicks_on_checkout_button() throws InterruptedException {
		Thread.sleep(1000);
		order.checkout().click();
	}

	@And("user fills out the information")
	public void user_fills_out_the_information() throws InterruptedException {
		Thread.sleep(1000);
		order.city().sendKeys("Cairo");
		order.address().sendKeys("1333 Trainer Avenue");
		order.zipcode().sendKeys("61274");
		order.phonenum().sendKeys("01234567891");
		order.country().selectByValue("123");

		Thread.sleep(1000);
	}

	@And("clicks on continue button")
	public void clicks_on_continue_button() throws InterruptedException {
		Thread.sleep(1000);
		order.continuebtn().click();
		
		Thread.sleep(1000);
		order.contbtn().click();
		
		Thread.sleep(1000);
		order.cntBtn().click();
		
		Thread.sleep(1000);
		order.cntCheckout().click();
		
		Thread.sleep(1000);
	}

	@Then("order will be successfully")
	public void order_will_be_successfully() throws InterruptedException {
		Thread.sleep(1000);
		order.confirmOrder().click();
		
		String actual = order.successmsg().getText();
		//String expected = "Your order has been successfully processed!";
		String expected = "nopCommerce";
		//System.out.println("acTUALLLLLLL" + actual);
		
		assertTrue(actual.equals(expected));
		Thread.sleep(1000);
	}

//	@After
//	public void closeDriver() {
//		driver.close();
//		driver.quit();
//	}

}
