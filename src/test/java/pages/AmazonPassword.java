package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPassword {
	WebDriver driver; 
	public AmazonPassword(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "ap_password")
	WebElement enterPassword; 
	public void EnterKeyPasscode(String password) {
		enterPassword.sendKeys(password);
	}
	@FindBy(id = "signInSubmit")
	WebElement SigninAfterPasscode;
	public void clicksubmit() {
		SigninAfterPasscode.click();
	}
	

}
