package pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;

public class homePagePOM {
	
	WebDriver driver;
	
	// constructor
		public homePagePOM(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	// for currency drop down menu
	public WebElement currencymenu() {
		By currencymenu = By.name("customerCurrency");
		WebElement menuEle = driver.findElement(currencymenu);
		return menuEle;
	}
	
	// choose currency 
	public Select euroPOM() {
		By euro = By.id("customerCurrency");
		Select euroEle = new Select(driver.findElement(euro));
		return euroEle;
	}
	
	// product currency display
	public List<WebElement> currencyDisplayed() {	
		// all the elements in the class iem box are saved here
		List<WebElement> ele = driver.findElements(By.className("actual-price"));
		return ele;
	}
	
	// for search
	public List<WebElement> searchDisplayed() {	
		// all the elements in the class item box are saved here
		List<WebElement> ele = driver.findElements(By.className("product-title"));
		return ele;
	}
	
	// for search bar
	public WebElement searchBar() {
		By searchtype = By.id("small-searchterms");
		WebElement searchEle = driver.findElement(searchtype);
		return searchEle;
	}
	
	// for search item in sku 
	public WebElement searchSku() {
	//	By searchSku = By.id("ui-id-2");
		By searchSku = By.xpath("//*[@id=\"ui-id-2\"]");
		WebElement SkuEle = driver.findElement(searchSku);
		return SkuEle;
	}
	
	// for sku assertion
	public WebElement skuassertion() {
		//By askuassert = By.id("sku-17");
		By askuassert = By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[6]/div");
		WebElement skuEle = driver.findElement(askuassert);
		return skuEle;	
	}
	
	// for sku "SCI-FAITH"
	public WebElement sciFaith() {
		//By scifaith = By.id("sku-36");
		//By scifaith = By.xpath("//*[@id=\"sku-36\"]");
		By scifaith = By.linkText("SKU");
		WebElement sciEle = driver.findElement(scifaith);
		return sciEle;
	}
	
	
	// for sku "SfPRO"
		public WebElement sfPro() {
			By sfPro = By.id("sku-12");
			WebElement sfProEle = driver.findElement(sfPro);
			return sfProEle;
		}
	
	
	
	
	// for search button
	public WebElement searchBtn() {
		By searchbtn = By.xpath("//*[@id=\"small-search-box-form\"]/button");
		WebElement searchbtnEle = driver.findElement(searchbtn);
		return searchbtnEle;
	}
	
	
///////////// for hover over categories //////////////////
	
	// for hover over computers
	public WebElement compHover() {
		By chover = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a");
		WebElement cEle =  driver.findElement(chover);
		return cEle;
	}
	
	// for desktop click
	public WebElement deskHover() {
		By deskhover = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a");
		WebElement deskEle = driver.findElement(deskhover);
		return deskEle;
	}
	
	// for desktop element as the bread crumbs
	public WebElement desktop() {
		By deskelement = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1");
		WebElement deskelementEle = driver.findElement(deskelement);
		return deskelementEle;
	}

	
///////////// for slider //////////////////
	
	// for nokia lumia slider 
	public WebElement nokiaslider() {
		By nokiaSlider = By.xpath("//*[@id=\"nivo-slider\"]/a[1]");
		WebElement nokiaEle = driver.findElement(nokiaSlider);
		return nokiaEle;
	}
	
	
	// for iphone button down in slider
	public WebElement iphoneButton() {
		By iphoneBtn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[2]");
		WebElement iphonebtnEle = driver.findElement(iphoneBtn);
		return iphonebtnEle;
	}
	
	
	// for iphone slider 
	public WebElement Iphoneslider() {
		By iphoneSlider = By.xpath("//*[@id=\"nivo-slider\"]/a[2]");
		WebElement iphoneEle = driver.findElement(iphoneSlider);
		return iphoneEle;
	}
	
	
	///////////// for follow us //////////////////
	
	// for facebook link
	public WebElement fbLink() {
		By fb = By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a");
		WebElement fbEle = driver.findElement(fb);
		return fbEle;
	}
	
	// for twitter link
	public WebElement twitterlink() {
		By twitter = By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a");
		WebElement twitterEle = driver.findElement(twitter);
		return twitterEle;
	}
	
	// for rss link
	public WebElement rssLink() {
		By rss = By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a");
		WebElement rssEle = driver.findElement(rss);
		return rssEle;
	}
	
	// for youtube
	public WebElement youtube() {
		By youtube = By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a");
		WebElement youtubeEle = driver.findElement(youtube);
		return youtubeEle;
	}

}
