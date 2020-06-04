package com.hrms.testscripts;

import org.testng.annotations.Test;
import com.hrms.pages.Login;
import com.hrms.pages.Logout;
import com.hrms.pages.Verifypage;
import com.hrms.utility.BaseClass;

public class Tc_001 {
	@Test
public void tc_001() throws Exception {
	//test case steps
	BaseClass.openapplication();
	Verifypage.verifytitle("HRMS");
	Login.login("admin","admin");
	Verifypage.verifytitle("OrangeHRM");
	Logout.logout();
	BaseClass.closeapplication();
}
}
