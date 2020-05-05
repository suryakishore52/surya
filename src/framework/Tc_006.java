package framework;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class Tc_006 {
	//public static void main(String args[]) throws Exception{
	@Test
	public void tc_006() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General g = new General();
		//test case steps
		g.openapplication();
		g.login();
		g.delmp();
		g.logout();
		g.closebrowser();
}
}