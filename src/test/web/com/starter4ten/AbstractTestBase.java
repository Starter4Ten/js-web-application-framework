package com.starter4ten;

import net.thucydides.core.pages.Pages;

import org.junit.Before;
import org.junit.ClassRule;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/testApplicationContext-repositories.xml")
public class AbstractTestBase extends AbstractServerTest {

	@ClassRule
	public static WebdriverRule webDriverRule = new WebdriverRule();
	
	protected Pages pages;
	
	@Before
	public void before() {
		pages = new Pages(webDriverRule.getWebDriver());
		pages.setDefaultBaseUrl("http://localhost:8888");
		pages.start();
	}
    
    protected WebDriver getWebDriver() {
    	return webDriverRule.getWebDriver();
    }
    
	
}
