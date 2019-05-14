package com.frankbahar.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.frankbahar.pages.crm.accounts.AccountsPage;

public class TopMenu {
	/*
	 * 
	 * TopMenu ISA Page ???
	 * 
	 * HomePage HASA TopMenu AccountsPage HASA TopMenu
	 * 
	 * Page HASA TopMenu
	 */

	WebDriver driver;

	public TopMenu(WebDriver driver) {
		this.driver = driver;
	}

	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoFeeds() {

	}

	public AccountsPage gotoAccounts() {
		// driver.findElement(By.cssSelector("contains(text(),'Accounts')")).click();
		
		
		// driver.findElement(By.cssSelector(
		 //"body.crmBodyWin:nth-child(2) div.newTopbar:nth-child(10) crm-menu.newMenuTable div.crmMenuLeft:nth-child(1) crm-tab:nth-child(5) div.lyteMenuItems:nth-child(2) div.lyteItem:nth-child(4) > a:nth-child(1)"
		 // )).click();
		  
		  Page.click("accountstab_CSS");
		 		return new AccountsPage();
	}

	public void gotoDeals() {

	}

	public void gotoActivities() {

	}

	public void gotoReports() {

	}

	public void gotoAnalytics() {

	}

	public void gotoProjects() {

	}

	public void signOut() {

	}
}
