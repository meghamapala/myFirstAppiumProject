package com.testautomation.mobile.scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.testautomation.Utility.BrowserUtility;
import com.testautomation.mobile.pages.PageObjectPage1;
import com.testautomation.mobile.pages.PageObjectPage2;
import com.testautomation.mobile.pages.PageObjectPage3;

import io.appium.java_client.android.AndroidDriver;

public class PageObjectTestCase {
	
	@Test
	public void pageObjectTestCase() {
		
		AndroidDriver driver=BrowserUtility.getAndroidDriver();
		
		try {
			Thread.sleep(2000);
		PageObjectPage1 pageObjectPage1=new PageObjectPage1(driver);
		pageObjectPage1.clickOnViews();
		
		PageObjectPage2 pageObjectPage2=new PageObjectPage2(driver);
		pageObjectPage2.clickOnAutoComplete();
		
		PageObjectPage3 pageObjectPage3=new PageObjectPage3(driver);
		pageObjectPage3.getScrollText();
		
        }catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
        

