package com.frankbahar.pages.crm.accounts;

import org.openqa.selenium.By;

import com.frankbahar.base.Page;
import com.frankbahar.base.TopMenu;

public class CreateAccountPage extends Page{
	
	
	public void createAccount(String accountName) {
		type("accountname_CSS", accountName);
	}
}
