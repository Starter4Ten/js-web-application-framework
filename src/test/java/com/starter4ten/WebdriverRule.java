package com.starter4ten;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class controls setting up a WebDriver instance for tests.
 * 
 * It currently returns a firefox driver.  
 *
 */
public class WebdriverRule extends TestWatcher {

	private WebDriver wd;
	
	@Override
	protected void starting(Description description) {
		try {
			wd = createWebDriver(description);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private WebDriver createWebDriver(Description description) throws Exception {
			return new FirefoxDriver();
	}
	
	
	@Override
	protected void finished(Description description) {
		wd.quit();
	}
	
	public WebDriver getWebDriver() {
		return wd;
	}
	
}
