package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static	WebDriver driver;
public static void openapplication() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Drivers\\\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
}
public static void closeapplication() {
	driver.quit();
	}
}

