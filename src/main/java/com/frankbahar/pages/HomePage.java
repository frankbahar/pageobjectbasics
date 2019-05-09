package com.frankbahar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.frankbahar.base.Page;

public class HomePage extends Page {

	public void goToSupport() {
		driver.findElement(By.cssSelector("a.zh-support")).click();
	}

	public void goToSignUp() {
		// driver.findElement(By.cssSelector(".signup")).click();
		driver.findElement(By.cssSelector("a.zh-signup")).click();
	}

	public LoginPage goToLogin() {
		click("loginlink_CSS");
		// driver.findElement(By.cssSelector(".signin")).click();
		return new LoginPage();
	}

	public void goToZohoEdu() {
		driver.findElement(By.cssSelector("a.zoho-university-link")).click();
	}

	public void goToLearnMore() {

	}

	public void validateFooterLinks() {

	}
}
