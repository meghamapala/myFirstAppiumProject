package com.testautomation.mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage3 extends BasePage{
	
	public PageObjectPage3(AndroidDriver driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath = "//*[@text='3. Scroll']")
	private AndroidElement scroll_Link;
	
	public void getScrollText() throws InterruptedException {
		Thread.sleep(2000);
		scroll_Link.getText();
		System.out.println("The text from android app is :"+scroll_Link.getText());

      }

}
