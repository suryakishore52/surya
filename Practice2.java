package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice2 {
public static void main (String args[]) throws Exception{
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.jntuk.edu.in/");
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.linkText("View")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("ABOUT JNTUK")).click();
	driver.findElement(By.id("s")).sendKeys("time table");
	driver.findElement(By.id("searchsubmit")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("EXAMINATIONS")).click();
	driver.findElement(By.linkText("Academic Calendars")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Academic Calendars for the AY 2020-21")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("IMBA II,III,IV & IV Academic calendar")).click();
	
	Thread.sleep(2000);
	
	driver.navigate().back();
	driver.findElement(By.linkText("Admissions")).click();
	driver.findElement(By.xpath("//*[@id='menu-item-3206']/a")).click();

	//driver.findElement(By.linkText("Affiliated Colleges - Guntur")).click();
	
	driver.findElement(By.linkText("CONTACTS")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.className("efe")).click();
	driver.close(); 
	
	
	
}
}
