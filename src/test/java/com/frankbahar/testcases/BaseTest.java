package com.frankbahar.testcases;

import org.testng.annotations.AfterSuite;

import com.frankbahar.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown() {
		Page.quit();
	}
}
