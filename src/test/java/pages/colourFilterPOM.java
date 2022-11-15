package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class colourFilterPOM {
	WebDriver driver;
	
	// constructor
		public colourFilterPOM(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	// for clicking on apparel 
	public WebElement apparel() {
		By apparel = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a");
		WebElement apparelEle = driver.findElement(apparel);
		return apparelEle;
	}
	
	// to click on shoes after clicking on apparel
	public WebElement shoesclick() {
		By shoesclick = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]");
		WebElement shoesclickEle = driver.findElement(shoesclick);
		return shoesclickEle;
	}
	
	
	// to click on shoes after hovering over apparel
	public WebElement shoes() {
		By shoes = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a");
		WebElement shoesEle = driver.findElement(shoes);
		return shoesEle;
	}
	
	// to choose colour filter
	public WebElement colourfilter() {
		By colourfilter = By.id("attribute-option-16");
		WebElement colourfilterEle = driver.findElement(colourfilter);
		return colourfilterEle;
	}

}
