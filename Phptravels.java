package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Phptravels {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	System.out.println("browser opened");
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	System.out.println("application opened");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.xpath("//li[@id='admin']/a/span"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	
	WebElement element1 = driver.findElement(By.xpath("//li[@id=\"admin\"]/ul/li[1]/a/span"));
	
	Actions action1 = new Actions(driver);
	action1.moveToElement(element1).perform();
	driver.findElement(By.xpath("//li[@id=\"admin\"]/ul/li[1]/ul/li[1]/a/span")).click();
	Thread.sleep(2000);
	driver.switchTo().frame("rightMenu");   
	Thread.sleep(1000);
	driver.findElement(By.id("editBtn")).click();
	Select st = new Select(driver.findElement(By.name("cmbCountry")));
	Thread.sleep(2000);
	st.selectByVisibleText("Australia");
	Thread.sleep(1000);
	driver.switchTo().defaultContent(); 
	
	WebElement element2 = driver.findElement(By.xpath("//li[@id='admin']/a/span"));
	Actions action2 = new Actions(driver);
	action.moveToElement(element2).perform();
	Thread.sleep(2000);
	WebElement element3 = driver.findElement(By.xpath("//li[@id=\"admin\"]/ul/li[1]/a/span"));
	
	Actions action3 = new Actions(driver);
	action1.moveToElement(element3).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[1]/ul/li[2]/a/span")).click();
	Thread.sleep(2000);
	
	WebElement element4 = driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"));
	Actions action4 = new Actions(driver);
	action.moveToElement(element4).perform();
	Thread.sleep(2000);
	WebElement element5 = driver.findElement(By.xpath("//li[@id=\"admin\"]/ul/li[2]/a/span"));
	Thread.sleep(2000);
	Actions action5 = new Actions(driver);
	action1.moveToElement(element5).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@id=\"admin\"]/ul/li[2]/ul/li[2]/a/span")).click();
	
	
	
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("logout completed");
	driver.quit();
	System.out.println("application closed");
	

	
	
	
	
}
}
