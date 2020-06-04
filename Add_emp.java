package com.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.hrms.utility.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
public class Add_emp extends BaseClass {
//-----objects------
	static By btn_add = By.xpath("//form[@id='standardView']/div[3]/div[1]/input[1]");
	static By txt_last = By.name("txtEmpLastName");
	static By txt_first = By.name("txtEmpFirstName");
	static By choose_pic = By.name("photofile");
	String location = "C:\\Users\\surya\\Documents\\Scanned Documents\\Welcome Scan.jpg";
	static By btn_save = By.id("btnEdit");
	static By btn_back = By.className("backbutton");
	
	//-----functions-----
	public static void addemp(String ln,String fn) throws Exception{
		String location = "C:\\Users\\surya\\Documents\\Scanned Documents\\Welcome Scan.jpg";
		driver.switchTo().frame("rightMenu");
	Thread.sleep(1500);
	
	driver.findElement(btn_add).click();
	driver.findElement(txt_last).sendKeys(ln);
	driver.findElement(txt_first).sendKeys(fn);
	WebElement fileInput = driver.findElement(choose_pic);
	fileInput.sendKeys(location);
	driver.findElement(btn_save).click();
	driver.findElement(btn_back).click();	
	driver.switchTo().defaultContent();
System.out.println("adding new emp"); 
}
}
