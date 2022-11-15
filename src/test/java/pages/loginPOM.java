package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPOM {

	WebDriver driver;
	
	// constructor
	public loginPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// for login button
	public WebElement logbtn() {
		By logbtn = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
		WebElement logbtnEle = driver.findElement(logbtn);
		return logbtnEle;
	} 
	
	// for entering email
	public WebElement entermail() {
		By mail = By.name("Email");
		WebElement mailEle = driver.findElement(mail);
		return mailEle;
	}
	
	// for entering password
	public WebElement enterpass() {
		By pass = By.name("Password");
		WebElement passEle = driver.findElement(pass);
		return passEle;
	}
	
	// for login button
	public WebElement loginBtn() {
		By logbtn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
		WebElement btnEle = driver.findElement(logbtn);
		return btnEle;
	}
	
	// for account tab
	public WebElement accDisplay() {
	By acc = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	WebElement accEle = driver.findElement(acc);
	return accEle;
	}
}
