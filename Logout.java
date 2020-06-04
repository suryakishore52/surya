package com.hrms.pages;

import org.openqa.selenium.By;

import com.hrms.utility.BaseClass;

public class Logout extends BaseClass{
//---------objects------
	static By link_logout = By.linkText("Logout");
	
	
	//-------functions-----
	public static void logout() {
		driver.findElement(link_logout).click();
	}
}
