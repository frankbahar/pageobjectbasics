package com.frankbahar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.frankbahar.base.Page;

public class LoginPage extends Page {

	public ZohoAppPage doLogin(String username, String password) {
	//	driver.switchTo().frame("Zohoiam");
		type("email_CSS", username);
		type("password_CSS", password);
		click("signbtn__CSS");
		return new ZohoAppPage();
	}

	public void gotoSalesandMarketing() {

	}

	public void gotoFinance() {

	}
}
