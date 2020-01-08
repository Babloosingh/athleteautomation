package com.project.capabilitySetup;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Step;

public class capabilitySetup {

	public static AppiumDriver<MobileElement> driver = null;

	// @BeforeClass
	@BeforeMethod
	// add

	public static void setupDeviceCapability() {
		
		DesiredCapabilities ds = new DesiredCapabilities();
		ds.setCapability("platformName", "iOS");
		ds.setCapability("platformVersion", "13.2");
		ds.setCapability("automationName", "XCUITest");
		ds.setCapability("deviceName", "iPhone 7 ");
		ds.setCapability("app", "com.uninterrupted.athlete.app");
		ds.setCapability("udid", "5105471cd626f9895d93de8b9d19365a602f8141");
		ds.setCapability("noReset", "true");
		ds.setCapability("useNewWDA", "true");
		
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), ds);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}


	}

	@Step("Getting value by {type} on {selector}}")
	public static String getText(String type, String selector) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (type.equals("xpath")) {
			return driver.findElement(By.xpath(selector)).getText();
		} else if (type.equals("id")) {
			return driver.findElement(By.id(selector)).getText();
		} else if (type.equals("class")) {
			return driver.findElement(By.id(selector)).getText();
		} else if (type.equals("AccessibilityId")) {
			return driver.findElementByAccessibilityId(selector).getText();
		} else
			return null;
	}


	@Step("Clicking by {type} on {selector}}")
	public static void click(String type, String selector) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (type.equals("xpath")) {
			driver.findElement(By.xpath(selector)).click();
		} else if (type.equals("id")) {
			driver.findElement(By.id(selector)).click();
		} else if (type.equals("AccessibilityId")) {
			driver.findElementByAccessibilityId(selector).click();
		}
	}

	@Step("Enter by {type} on {selector}}")
	public static void enterText(String type, String selector, String keysToSend) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		if (type.equals("xpath")) {
			driver.findElement(By.xpath(selector)).sendKeys(keysToSend);
		} else if (type.equals("id")) {
			driver.findElement(By.id(selector)).sendKeys(keysToSend);
		} else if (type.equals("AccessibilityId")) {
			driver.findElementByAccessibilityId(selector).sendKeys(keysToSend);
		}
	}
	

	// @AfterClass
	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}

}

