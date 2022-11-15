package stepDefintions;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import pages.homePagePOM;
import pages.loginPOM;

public class currenciesStepDefinition {
	
	WebDriver driver;
	homePagePOM homep;
	
	@Given("user goes to home page")
	public void user_goes_to_home_page() {
	  
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dejaa\\Downloads\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
			homep = new homePagePOM(driver);
			
			driver.navigate().to("https://demo.nopcommerce.com/?fbclid=IwAR0-VZno563vbMs0_swYdOkMP_-mRoCk71gbaAWYeHwLjpnEYuq1CV50vCM");
			driver.manage().window().maximize();
	}

	@When("user clicks on currency drop down menu")
	public void user_clicks_on_currency_drop_down_menu() {
	   homep.currencymenu().click();
	}

	@When("chooses euro")
	public void chooses_euro() {
	    homep.euroPOM().selectByIndex(1);
	}

	@Then("user switched currency successfully")
	public void user_switched_currency_successfully() {
	List<WebElement> ele = homep.currencyDisplayed();
		for(int i = 0; i <ele.size(); i++) {
			String actualprice = ele.get(i).getText(); 
			String expected = "€";
			System.out.println("act ptice: " + actualprice);
			
			assertTrue(actualprice.contains(expected));
		}
	}
//	
//	@After
//	public void closeDriver() {
//		driver.quit();
//	}	
//	


}
