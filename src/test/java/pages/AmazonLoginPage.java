package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
	WebDriver driver; 
	public AmazonLoginPage(WebDriver driver) { //constructor 
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "ap_email") 
	WebElement emailAddress;
	public void enterEmail(String email) {
		emailAddress.sendKeys(email);
		
	}
	@FindBy(id = "continue") 
	WebElement continueButton;
	public void clickContinue() {
		continueButton.click();
	}
	

}
