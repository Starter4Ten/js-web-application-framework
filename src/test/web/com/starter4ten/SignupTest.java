package com.starter4ten;


import org.junit.Test;
import static org.hamcrest.text.IsEmptyString.*;
import static org.hamcrest.MatcherAssert.assertThat;


public class SignupTest extends AbstractTestBase {

	@Test
	public void testSignupPageDisplaysUserElements_withBlankDefaults() {
		// GIVEN we are on the registration page and the user clicks on signup links
		 SignupPage signupPage = pages.currentPageAt(RegistrationPage.class).signup();
		 
		// THEN signup page is shown with all expected elements
		 signupPage.assertAllElementsDisplayed();
		 
		 // AND email is blank
		 assertThat(signupPage.getEmail(), isEmptyString());
		 
		 // AND name is blank
		 assertThat(signupPage.getEmail(), isEmptyString());
	}

}
