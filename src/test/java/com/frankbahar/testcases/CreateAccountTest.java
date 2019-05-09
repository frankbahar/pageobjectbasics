package com.frankbahar.testcases;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.frankbahar.base.Page;
import com.frankbahar.pages.ZohoAppPage;
import com.frankbahar.pages.crm.accounts.AccountsPage;
import com.frankbahar.pages.crm.accounts.CreateAccountPage;
import com.frankbahar.utilities.Utilities;

public class CreateAccountTest extends BaseTest {

	@Test(dataProviderClass=Utilities.class, dataProvider="dp")
	public void createAccountTest(Hashtable<String, String> data) {
		ZohoAppPage zp = new ZohoAppPage();
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount(data.get("accountname"));
		Assert.fail("Create Account Test Failed");

	}
}
