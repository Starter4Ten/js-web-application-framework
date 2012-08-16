package com.starter4ten;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;


@DefaultUrl("http://localhost:8888/")
public class RegistrationPage extends PageObject{
	@FindBy(linkText = "sign up")
	private WebElement signup;

	
	public RegistrationPage(WebDriver wd) {
	    super(wd);
	}
	
	public SignupPage signup(){
		signup.click();
		return PageFactory.initElements(getDriver(), SignupPage.class);
	}
}
