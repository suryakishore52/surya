package com.hrms.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.BaseClass;

public class Del_emp extends BaseClass {
//-------objects-----
	
	static By loc_code = By.id("loc_code");
	static By loc_name = By.name("loc_name");
	static By btn_search=By.xpath("//form[@id='standardView']/div[2]/input[2]");
	static By btn_find =By.xpath("//form[@id='standardView']/table/tbody/tr/td[1]/input");
	
	
	
	
	//-------functions------
	public static void delemp(String series) throws Exception{
	driver.switchTo().frame("rightMenu");
	Select st = new Select(driver.findElement(loc_code));
	st.selectByVisibleText("Emp. ID");
	driver.findElement(loc_name).sendKeys(series);
	driver.findElement(btn_search).click();
	driver.findElement(btn_find).click();
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
}
}
