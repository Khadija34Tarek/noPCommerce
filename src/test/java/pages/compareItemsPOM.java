package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class compareItemsPOM {

	WebDriver driver;
	
	// constructor
		public compareItemsPOM(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	// to click on compare button
	public WebElement comparebtn() {
		By compare = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[2]");
		WebElement compareEle = driver.findElement(compare);
		return compareEle;
	}
	
	// success msg
	public WebElement comparemsg() {
		//By compmsg = By.id("bar-notification");
		By compmsg = By.xpath("//div[@id='bar-notification']/div/p");
		WebElement compmsgEle = driver.findElement(compmsg); 
		return compmsgEle;
	}
	
	// close msg
	public WebElement closemsg() {
		By close = By.xpath("//*[@id=\"bar-notification\"]/div/span"); 
		WebElement closeEle = driver.findElement(close);
		return closeEle;
	}
	
}
