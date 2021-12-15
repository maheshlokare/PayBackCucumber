package parallel;

import org.testng.Assert;

import com.pages.PayBackPage;
import com.qa.util.Constants;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



/**
 * @author mlokare
 * this class is used to specify steps specific to end2end 
 */
public class PayBackStep {
	
	PayBackPage paybackPage ;
	Constants constants = new Constants();
	
	@Given("user logins into payback application")
	public void user_logins_into_payback_application() throws InterruptedException {
		paybackPage = new PayBackPage();
		letsWait();
		// Here we have to perform login action manually because of security issues we can automate this
		paybackPage.clickOnLoginButton();
		System.out.println("Please perform the login manually as we cant automate this step because of security reasons");
		
	}
	
	@Given("user clicks on coupons")
	public void user_clicks_on_coupons() {
		paybackPage.clickPartnerErkunden();
		paybackPage.navigateUp();
		paybackPage.clickCoupons();
	}
	
	
	@Given("user saves the number of activated coupons")
	public void user_saves_the_number_of_activated_coupons() {
	}
	
	@Given("user clicks on filter option")
	public void user_clicks_on_filter_option() {
		paybackPage.clickFilterCoupons();
	}

	@When("user selects required partner")
	public void user_selects_required_partner() {
		paybackPage.selectReweCard();
	}
	
	@When("user click on activation")
	public void user_click_on_activation() {
		paybackPage.activateCard();
	}
	
	
	@Then("verify user activation is successful {string}")
	public void verify_user_activation_is_successful(String expectedtext) {
		String actualtext = paybackPage.activationMessage();
		Assert.assertEquals(expectedtext, actualtext);
	}

	
	@Then("user comes back to coupons page")
	public void user_comes_back_to_coupons_page() {
	}
	
	@Then("verify activated cards number is incresed by one")
	public void verify_activated_cards_number_is_incresed_by_one() {
	}
	
	@Given("user saves the number of not activated coupons")
	public void user_saves_the_number_of_not_activated_coupons() {
	}
	
	@Then("verify not activated cards number is reduced by one")
	public void verify_not_activated_cards_number_is_reduced_by_one() {
	}
	
	public void letsWait() throws InterruptedException {
		Thread.sleep(15000); 
	}




}
