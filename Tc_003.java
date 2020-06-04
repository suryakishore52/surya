package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.pages.Add_emp;
import com.hrms.pages.Del_emp;
import com.hrms.pages.Login;
import com.hrms.pages.Logout;
import com.hrms.pages.Verifypage;
import com.hrms.utility.BaseClass;

public class Tc_003 {
	@Test
	public void tc_003() throws Exception {
		//test case steps
		BaseClass.openapplication();
		Verifypage.verifytitle("HRMS");
		Login.login("admin","admin");
		Verifypage.verifytitle("OrangeHRM");
		Add_emp.addemp("adda", "first");
		Del_emp.delemp("0033");
		Logout.logout();
		BaseClass.closeapplication();
	}
}
