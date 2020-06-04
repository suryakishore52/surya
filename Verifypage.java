package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class Verifypage extends BaseClass{
//-----verify title------
	public static void verifytitle(String title) {
		if(driver.getTitle().equals(title)) {
			Reporter.log("Title matched");
			
		}
		else {
			Reporter.log("Title not matched and expected title is"+ driver.getTitle());
			
		}
	}
}
