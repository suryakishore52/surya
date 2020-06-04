package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.Add_emp;
import com.hrms.pages.Login;
import com.hrms.pages.Logout;
import com.hrms.pages.Verifypage;
import com.hrms.utility.BaseClass;

public class Tc_002 {
	@Test
	public void tc_002() throws Exception {
		//test case steps
		BaseClass.openapplication();
		Verifypage.verifytitle("HRMS");
		Login.login("admin","admin");
		Verifypage.verifytitle("OrangeHRM");
		Add_emp.addemp("adda", "first");
		Logout.logout();
		BaseClass.closeapplication();
	}
}
