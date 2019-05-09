package com.frankbahar.pages.crm.accounts;

import org.openqa.selenium.By;

import com.frankbahar.base.Page;
import com.frankbahar.base.TopMenu;

public class AccountsPage extends Page {

	public CreateAccountPage gotoCreateAccounts() {
		/*
		 * driver.findElement(By.cssSelector(
		 * "body.crmBodyWin:nth-child(2) div.bodycontainer:nth-child(16) div.onboarding-gradient-bg.h100p div.onboardingcontainer.w500.p40 div.clearfix div.clearfix.mT30 div.fL.w50per:nth-child(1) div.ob_bdrcontainer.pR.mT30 div.sameWidthbuttonscontainer link-to:nth-child(1) lyte-button.dB button.lyte-button.lytePrimaryBtn:nth-child(2) > lyte-yield:nth-child(1)"
		 * )) .click();
		 */
		 click("createaccountbtn_CSS");
		return new CreateAccountPage();
	}

	public void gotoImportAccounts() {

	}
}
