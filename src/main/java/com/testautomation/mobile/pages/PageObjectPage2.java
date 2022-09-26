package com.testautomation.mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PageObjectPage2 extends BasePage{
	
	public PageObjectPage2(AndroidDriver driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath = "//*[@text='Auto Complete']")
	private AndroidElement autoComplete_Link;
	
	public void clickOnAutoComplete() throws InterruptedException {
		autoComplete_Link.click();
      }

}
