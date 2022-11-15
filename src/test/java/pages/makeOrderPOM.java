package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class makeOrderPOM {
	WebDriver driver;

	// constructor
	public makeOrderPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
		}

	// shopping cart button
	public WebElement shoppingcart() {
		By shoppingcart = By.id("topcartlink");
		WebElement shoppingcartEle = driver.findElement(shoppingcart);
		return shoppingcartEle;
	}

	// terms of service
	public WebElement terms() {
		//By TC = By.name("termsofservice");
		By TC = By.xpath("//input[@id='termsofservice']");
		WebElement TCEle = driver.findElement(TC);
		return TCEle;
	}

	// checkout button
	public WebElement checkout() {
		By checkout = By.id("checkout");
		WebElement checkoutEle = driver.findElement(checkout);
		return checkoutEle;
	}

	// city "Cairo"
	public WebElement city() {
		By cityname = By.id("BillingNewAddress_City");
		WebElement cityEle = driver.findElement(cityname);
		return cityEle;
	}

	// address "1333 Trainer Avenue"
	public WebElement address() {
		By address = By.name("BillingNewAddress.Address1");
		WebElement addressEle = driver.findElement(address);
		return addressEle;
	}

	// zip code "61274"
	public WebElement zipcode() {
		By zipcode = By.id("BillingNewAddress_ZipPostalCode");
		WebElement zipcodeEle = driver.findElement(zipcode);
		return zipcodeEle;
	}

	// phone number "01234567891"
	public WebElement phonenum() {
		By phoneno = By.id("BillingNewAddress_PhoneNumber");
		WebElement phoneEle = driver.findElement(phoneno);
		return phoneEle;
	}

	// continue button
	public WebElement continuebtn() {
		By continuebtn = By.name("save");
		//By coninuebtn = By.xpath("//button[4]");
		WebElement contBtnEle = driver.findElement(continuebtn);
		return contBtnEle;
	}

	// country by value "123"
	public Select country() {
		By country = By.id("BillingNewAddress_CountryId");
		Select countryEle = new Select(driver.findElement(country));
		return countryEle;
	}

	// continue button tanyy
	public WebElement contbtn() {
		By contbtn = By.xpath("(//button[@type='button'])[7]");
		
		WebElement contbtnEle = driver.findElement(contbtn);
		return contbtnEle;
	}

	// continue 3 "payment"
	public WebElement cntBtn() {
//		By CBTN = By.name("save");
		By CBTN = By.xpath("//*[@id=\"payment-method-buttons-container\"]/button");
		WebElement cBELE = driver.findElement(CBTN);
		return cBELE;
	}

	// continue 4
	public WebElement cntCheckout() {
		By cntCheck = By.xpath("(//button[@type='button'])[9]");
		WebElement cntCheckEle = driver.findElement(cntCheck);
		return cntCheckEle;
	}

	// confirm order
	public WebElement confirmOrder() {
		By Confirm = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button");
		WebElement confirmEle = driver.findElement(Confirm);
		return confirmEle;
	}

	// success text 
	public WebElement successmsg() {
	    By successmsg = By.xpath("//div[2]/a");
//		By successmsg = By.className("title");
//		By successmsg = By.linkText("Click here for order details.");
		WebElement successmsgEle = driver.findElement(successmsg);
		return successmsgEle;
	}
}
