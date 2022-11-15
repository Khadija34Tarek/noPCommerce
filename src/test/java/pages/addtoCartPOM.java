package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addtoCartPOM {

	WebDriver driver;

	// constructor
	public addtoCartPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// to click on add to cart button in home page
	public WebElement addtocart() {
		By addproduct = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]");
		WebElement addproductEle = driver.findElement(addproduct);
		return addproductEle;
	}

	// to click add to cart button in product page this is the actual btn
	public WebElement addproduct() {
		//By addtocartbtn = By.id("add-to-cart-button-1");
		By addtocartbtn = By.xpath("//div/button");
		WebElement addbtnEle = driver.findElement(addtocartbtn);
		return addbtnEle;
	}

	// to select ram
	public Select selectram() {
		// or by id = product_attribute_2;
		By selectRam = By.id("product_attribute_2");
		Select selectRamEle = new Select(driver.findElement(selectRam));
		return selectRamEle;
		// select by value 3 2GB
	}

	// to select HDD
	public WebElement HDD() {
		By hdd = By.name("product_attribute_3");
		WebElement hddEle = driver.findElement(hdd);
		return hddEle;
	}

	// success msg of adding product to cart
	public WebElement successmsg() {
		By successmsg = By.xpath("//p");
		WebElement successmsgEle = driver.findElement(successmsg);
		return successmsgEle;
		// the msg : The product has been added to your
	}

	// to close msg
	public WebElement closemsg() {
		By closemsg = By.xpath("//*[@id=\"bar-notification\"]/div/span");
		WebElement closemsgEle = driver.findElement(closemsg);
		return closemsgEle;
	}

}
