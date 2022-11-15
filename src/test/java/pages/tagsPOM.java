package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tagsPOM {

	WebDriver driver;
	
	// constructor
	public tagsPOM(WebDriver driver) {
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
		
		// clicks on a tag
		public WebElement choosetag() {
			By tag = By.xpath("//a[contains(text(),'apparel')]");
			WebElement tagEle = driver.findElement(tag);
			return tagEle;
		}

		// tag applied
		public WebElement tagapplied() {
			By tagapplied = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1");
			WebElement tagappEle = driver.findElement(tagapplied);
			return tagappEle;
		}
}
