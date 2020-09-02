package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quikr {
public static void main(String args[]) throws Exception{
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.quikr.com/");
	System.out.println(driver.getTitle());
	
	driver.findElement(By.linkText("Mobiles & Tablets")).click();
	driver.findElement(By.id("brandInp")).click();
	driver.findElement(By.linkText("Apple")).click();
	
	
	Thread.sleep(2000);
	driver.findElement(By.id("modelInp")).click();
	driver.findElement(By.linkText("iPhone SE")).click();
	driver.findElement(By.id("priceInp")).click();
	driver.findElement(By.xpath("//*[@id=\"priceInp_selectWrap\"]/ul/li[7]")).click();
	driver.findElement(By.id("mobileSearch")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='allIndiaCont']/a[1]/div/div[2]/div/h3")).click();
	driver.findElement(By.className("q-bazaar-logo")).click();
	
	driver.findElement(By.linkText("Deals")).click();
	for (String handle : driver.getWindowHandles()) {  
	     driver.switchTo().window(handle);
			    	}  
	
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
}
}
