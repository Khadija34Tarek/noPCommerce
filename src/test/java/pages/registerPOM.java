package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerPOM {
	
WebDriver driver;
	
	// constructor 
	public registerPOM(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// for register button
	public WebElement registerBPOM() {
		By register = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
		WebElement registerEle = driver.findElement(register);
		return registerEle;
	}
	
	// gender radio button
	public WebElement genderPOM() {
		By gender = By.id("gender-male");
		WebElement genderEle = driver.findElement(gender);
		return genderEle;
	}
	
	// for first name 
	public WebElement fnamePOM() {
		By fname = By.id("FirstName");
		WebElement fnameEle = driver.findElement(fname);
		return fnameEle;
	}
	
	// for last name
	public WebElement lnamePOM() {
		By lname = By.id("LastName");
		WebElement lnameEle = driver.findElement(lname);
		return lnameEle;
	}

	// for day in DOB
	public Select dayDOBPM() {
		By dayBD = By.name("DateOfBirthDay");
		Select dayEle = new Select (driver.findElement(dayBD));
		return dayEle;
	}
	
	// for month in DOB
	public Select monthDOBPM() {
		By monthBD = By.name("DateOfBirthMonth");
		Select monthEle = new Select (driver.findElement(monthBD));
		return monthEle;
	}
	
	// for year in DOB
	public Select yearDOBPM() {
		By yearBD = By.name("DateOfBirthYear");
		Select yearEle = new Select (driver.findElement(yearBD));
		return yearEle;
	}

	// for email 
	public WebElement emailPOM() {
		By email = By.name("Email");
		WebElement emailEle = driver.findElement(email);
		return emailEle;
	}  
	
	// for password
	public WebElement passPOM() {
		By pass = By.name("Password");
		WebElement passEle = driver.findElement(pass);
		return passEle;
	}
	
	// for confirm password
	public WebElement confpassPOM() {
		By confpass = By.name("ConfirmPassword");
		WebElement confpassEle = driver.findElement(confpass);
		return confpassEle;
	}

	// for register button
	public WebElement registerbtnPOM() {
		By registerbtn = By.name("register-button");
		WebElement registerbtnEle = driver.findElement(registerbtn);
		return registerbtnEle;
	}
	
	// for message appearance
	public WebElement msgPOM() {
		By msg = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]");
		WebElement msgEle = driver.findElement(msg);
		return msgEle;
	}
}
