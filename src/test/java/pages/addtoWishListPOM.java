package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class addtoWishListPOM {
	
	WebDriver driver;
	
 
	// constructor
		public addtoWishListPOM(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	
	// click on heart in home page
	public WebElement heart() {
		By heart = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[3]");
		WebElement heartEle = driver.findElement(heart);
		return heartEle;
	}

	// click on heart in product page
	public WebElement heartProduct() {
//		By heartPro = By.id("add-to-wishlist-button-1");
		By heartPro = By.xpath("//button[contains(.,'Add to wishlist')]");
		WebElement heartProEle = driver.findElement(heartPro);
		return heartProEle;
	}
	
	// choose the ram and hdd from add to cart POM
	
	// msg wishlist
	public WebElement wishListmsg() {
		By wishmsg = By.cssSelector(".content");
		WebElement wishmsgEle = driver.findElement(wishmsg);
		return wishmsgEle;
	}
	
	//close wish msg
	public WebElement closewishMsg() {
		By closeWishMsg = By.xpath("//*[@id=\"bar-notification\"]/div/span");
		WebElement closeWishEle = driver.findElement(closeWishMsg);
		return closeWishEle;
	}
}
