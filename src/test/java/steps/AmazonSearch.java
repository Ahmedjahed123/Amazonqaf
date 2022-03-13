package steps;

import common.AmazonBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHome;
import pages.AmazonLoginPage;
import pages.AmazonPassword;

public class AmazonSearch extends AmazonBase{
	@Given("I am on amazon homepage")
	public void i_am_on_amazon_homepage() {
		launchBrowser();
	   
	}

	@When("I click on sign in button")
	public void i_click_on_sign_in_button() {
	   AmazonHome a = new AmazonHome(driver);
	   a.clickIn();
	}

	@When("I enter {string} address and click continue")
	public void i_enter_address_and_click_continue(String string) {
		AmazonLoginPage am = new AmazonLoginPage(driver);
		am.enterEmail(string);
		am.clickContinue();
		
	}

	@When("I enter invalid {string} and click continue")
	public void i_enter_invalid_and_click_continue(String string) {
		AmazonPassword pw = new AmazonPassword(driver);
		pw.EnterKeyPasscode(string);
		pw.clicksubmit();
	   
	}

	@Then("I receive an error message")
	public void i_receive_an_error_message() {
	   
	}


}
