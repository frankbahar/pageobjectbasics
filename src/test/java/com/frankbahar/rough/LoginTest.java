package com.frankbahar.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.frankbahar.base.Page;
import com.frankbahar.pages.HomePage;
import com.frankbahar.pages.LoginPage;
import com.frankbahar.pages.ZohoAppPage;
import com.frankbahar.pages.crm.CRMHomePage;
import com.frankbahar.pages.crm.accounts.AccountsPage;
import com.frankbahar.pages.crm.accounts.CreateAccountPage;

public class LoginTest {

	public static void main(String[] args) {
		//this is a rough package
		HomePage home = new HomePage();
		LoginPage lp = home.goToLogin();
		ZohoAppPage zp = lp.doLogin("fikretbahar@yahoo.com", "Selenium@123");
	  //login.doLogin("trainer@way2automation.com", "Selenium@123");
		zp.gotoCRM();
		AccountsPage account = Page.menu.gotoAccounts();
		CreateAccountPage cap = account.gotoCreateAccounts();
		cap.createAccount("Frank");
				
	}

}
