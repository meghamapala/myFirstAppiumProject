package com.testautomation.Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class BrowserUtility {
	
	public static WebDriver OpenBrowser(WebDriver driver,String browserName,String url) throws InterruptedException
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/meghamapalagama/eclipse-workspace/myFirstAppiumProject/chromedriver 4");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			Thread.sleep(5000);
			return driver;	
		}else 
		if(browserName.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "L:\\TestAutomationFramework\\CucumberJarFiles\\chromedriver_win32_2.37\\chromedriver.exe");
			DesiredCapabilities capabilities=new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "accept");
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability("ignoreZoomSetting", true);
			capabilities.setCapability("requireWindowFocus", true);//to move mouse manually			
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;	
		} else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.ie.driver", "L:\\TestAutomationFramework\\CucumberJarFiles\\chromedriver_win32_2.37\\chromedriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			return driver;	
		}
			return null;			
	}
	
	public static AndroidDriver getAndroidDriver() {
		    AndroidDriver driver = null;
		    try {
			  DesiredCapabilities caps = new DesiredCapabilities();
		      caps.setCapability("deviceName", "My Device");
		      caps.setCapability("udid", "emulator-5554"); // DeviceId from "adb devices" command
		      caps.setCapability("platformName", "Android");
		      caps.setCapability("platformVersion", "10.0");
		      caps.setCapability("appPackage", "io.appium.android.apis");
		      caps.setCapability("appActivity", ".ApiDemos");
		      driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
			
			return driver;
	    }
	}
