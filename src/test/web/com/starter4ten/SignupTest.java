package com.starter4ten;


import org.junit.Test;

public class SignupTest extends AbstractTestBase {

	@Test
	public void test() {
		 SignupPage signupPage = pages.currentPageAt(RegistrationPage.class).signup();
		

	}

}
