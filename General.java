package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.utility.Log;

public class General extends Global{
	public void openapplication(){
		Log.info("Started execution");
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url); 
		Log.info("application opened");
		}
	
		public void closebrowser(){
		driver.quit();
		Log.info("application closed");
		}
		public void login() throws Exception{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		Log.info("login done");
		}
		public void logout(){
		driver.findElement(By.linkText(link_logout)).click();
		Log.info("logout done");
		}
		public void addemp()throws Exception{
			driver.switchTo().frame("rightMenu");
			driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
			driver.findElement(By.name("txtEmpLastName")).sendKeys("adactin");
			driver.findElement(By.name("txtEmpFirstName")).sendKeys("adact");
			Thread.sleep(2000);
			WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
			fileInput.sendKeys("C:\\Users\\surya\\Documents\\Scanned Documents\\Welcome Scan.jpg");
			System.out.println("upload complete");
			driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
			Thread.sleep(1500);
			System.out.println("new empid");
			driver.findElement(By.xpath("/html/body/div[5]/input")).click();
			driver.switchTo().defaultContent();
		System.out.println("adding new emp"); 
		Log.info("add emp done");
		}
		public void delmp()throws Exception{
			driver.switchTo().frame("rightMenu");
			Select st = new Select(driver.findElement(By.name("loc_code")));
			st.selectByVisibleText("Emp. ID");
			driver.findElement(By.name("loc_name")).sendKeys("0034");
			driver.findElement(By.xpath("//form[@id=\"standardView\"]/div[2]/input[2]")).click();
			driver.findElement(By.xpath("//form[@id=\"standardView\"]/table/tbody/tr/td[1]/input")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form[@id='standardView']/div[3]/div/input[2]")).click();
			System.out.println("Del emp");
			driver.switchTo().defaultContent();
		System.out.println("delete emp"); 
		Log.info("del emp done");
		}
		
}
