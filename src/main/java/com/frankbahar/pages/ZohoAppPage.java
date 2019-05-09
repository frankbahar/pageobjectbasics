package com.frankbahar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.frankbahar.base.Page;
import com.frankbahar.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{

	public void gotoCliq() {
		driver.findElement(By.cssSelector(".zicon-apps-chat.zicon-apps-96")).click();
	}
	
	public CRMHomePage gotoCRM() {
		click("crmlink_CSS");
		return new CRMHomePage();
	}
	
	public void gotoSalesIQ() {
		driver.findElement(By.cssSelector(".zicon-apps-salesiq.zicon-apps-96")).click();
	}
}
