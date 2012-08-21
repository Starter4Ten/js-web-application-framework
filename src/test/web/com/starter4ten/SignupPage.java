package com.starter4ten;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class SignupPage {
	@FindBy(id = "email")
	private WebElement emailField;

	@FindBy(id = "name")
	private WebElement nameField;

	@FindBy(id = "colours")
	private WebElement coloursSelection;
	
	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "passwordRpt")
	private WebElement passwordRptField;
	
	@FindBy(id = "submit")
	private WebElement submitButton;
	
	@FindBy(id = "reset")
	private WebElement cancelButton;

	public void assertAllElementsDisplayed() {
		assertThat(emailField.isDisplayed(), is(true));
		assertThat(nameField.isDisplayed(), is(true));
		assertThat(coloursSelection.isDisplayed(), is(true));
		assertThat(passwordField.isDisplayed(), is(true));
		assertThat(passwordRptField.isDisplayed(), is(true));
		assertThat(submitButton.isDisplayed(), is(true));
		assertThat(cancelButton.isDisplayed(), is(true));		
	}

	public String getEmail() {
		return emailField.getText();
	}

	public String getName() {
		return nameField.getText();
	}

}
