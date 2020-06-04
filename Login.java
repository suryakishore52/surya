package com.hrms.pages;

import org.openqa.selenium.By;

import com.hrms.utility.BaseClass;

public class Login extends BaseClass{
//-----objects-----
	static By txt_loginname = By.name("txtUserName");
	static By txt_password = By.name("txtPassword");
	static By btn_login = By.name("Submit");
	
	
	//--------functions-----------
	public static void login(String un, String pw) throws Exception{
		driver.findElement(txt_loginname).sendKeys(un);
		driver.findElement(txt_password).sendKeys(pw);
		driver.findElement(btn_login).click();
		Thread.sleep(2000);
	}
}
