package com.frankbahar.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.frankbahar.pages.HomePage;
import com.frankbahar.pages.LoginPage;
import com.frankbahar.pages.ZohoAppPage;
import com.frankbahar.utilities.Utilities;

public class LoginTest extends BaseTest {

	@Test(dataProviderClass = Utilities.class, dataProvider="dp")
	public void loginTest(Hashtable<String, String> data) {
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin(data.get("username"), data.get("password"));
		Assert.fail("Login test failed");
	}
}
