package com.pages;

import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

@SuppressWarnings(value = {"all"})
public class PayBackCouponsPage extends base{
	
	private AndroidDriver driver;
	
	
	
	public PayBackCouponsPage() {
		driver = capabilities();
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
}
