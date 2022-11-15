package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class resetPassPOM {
	
	WebDriver driver;

	// constructor
		public resetPassPOM(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	// forget password
	public WebElement forgetPass() {
		By forgetpass = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[3]/span/a");
		WebElement forgetpassEle = driver.findElement(forgetpass);
		return forgetpassEle;
	}
	
	// for entering email for reset pass
	public WebElement resetpassEmail() {
		By restpass = By.id("Email");
		WebElement resetpassEle = driver.findElement(restpass);
		return resetpassEle;
	}
	
	// for recover button
	public WebElement recoverBtn() {
		By recoverbtn = By.name("send-email");
		WebElement recoverbtnEle = driver.findElement(recoverbtn);
		return recoverbtnEle;
	}
	
	// pop up for email recovery
	public WebElement popUp() {
		By popupmsg = By.xpath("//*[@id=\"bar-notification\"]/div/p");
		WebElement popupmsgEle = driver.findElement(popupmsg);
		return popupmsgEle;
	}
	
	// to close the pop up
	public WebElement closemsg() {
		By closemsg = By.xpath("//*[@id=\"bar-notification\"]/div/span");
		WebElement closemsgEle = driver.findElement(closemsg);
		return closemsgEle;
	}

}
