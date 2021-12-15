package com.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.springframework.ui.context.Theme;

import com.qa.util.Constants;

import bsh.This;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author mlokare
 * this class consist of all locators from the application considering e2e scenario.
 * We can further break this into small test cases and separate validations
 *
 */
@SuppressWarnings(value = {"all"})
public class PayBackPage extends base {
	
	private AndroidDriver driver;
	public int TimeoutValue = Constants.time_out;
	
	public PayBackPage() {
		driver = capabilities();
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Login']")
	private WebElement loginButton;
	
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Partner erkunden']")
	private AndroidElement partnerErkunden;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
	private AndroidElement navigateBack;
	
	@AndroidFindBy(id = "de.payback.client.android:id/coupon_nav_graph")
	private AndroidElement coupons;
				  
	@AndroidFindBy(id = "de.payback.client.android:id/not_activated_button")
	private AndroidElement activateCard;
	
	
	@AndroidFindBy(id = "de.payback.client.android:id/redeem_offline_button")
	private AndroidElement activationString;
	
	@AndroidFindBy(xpath = "(//androidx.cardview.widget.CardView[@index='0'])[3]")
	private AndroidElement reweCard;
	
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public void clickPartnerErkunden() {
		partnerErkunden.click();
	}
	
	public void navigateUp() {
		navigateBack.click();
	}
	
	public void clickCoupons() {
		coupons.click();
	}
	
	public void selectReweCard() {
		reweCard.click();
	}
	
	public void activateCard() {
		activateCard.click();
	}
	
	public String activationMessage() {
		return activationString.getText();
	}
	
	@AndroidFindBy(id = "de.payback.client.android:id/filter_button")
	private WebElement filterButton;
	
	
	public void clickFilterCoupons() {
		filterButton.click();
	}

}
