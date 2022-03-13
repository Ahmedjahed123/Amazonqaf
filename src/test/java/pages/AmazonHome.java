package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHome {
	WebDriver driver; 
	public AmazonHome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); 
		
	}
	
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	WebElement Signinclick;
	public void clickIn() {
		Signinclick.click();
	}
	
	

}
