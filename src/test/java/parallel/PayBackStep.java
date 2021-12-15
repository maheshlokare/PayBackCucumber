package parallel;

import org.testng.Assert;

import com.pages.PayBackPage;
import com.qa.util.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PayBackStep {
	
	PayBackPage paybackPage ;
	Constants constants = new Constants();
	
	@Given("user logins into payback application")
	public void user_logins_into_payback_application() throws InterruptedException {
		paybackPage = new PayBackPage();
		
		paybackPage.clickOnLoginButton();
		Thread.sleep(15000); //Currently we are doing manual login due to security issues. So we placed a small sleep for manual login.
	}
	
	//Below steps follow after the login
	@Given("user clicks on coupons")
	public void user_clicks_on_coupons() {
		paybackPage.clickPartnerErkunden();
		//click on back arrow-page3
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




}
