package com.pages;

import org.openqa.selenium.support.PageFactory;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

@SuppressWarnings(value = {"all"})
public class PayBackFilterPage extends base{
	
	private AndroidDriver<AndroidElement> driver;
	
	
	
	public PayBackFilterPage() {
		driver = capabilities();
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

}
