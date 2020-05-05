package webdriverExamples;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class Fullprog {
public static void main (String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(1500);
	System.out.println(driver.getTitle());
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	driver.navigate().back();

	WebElement element = driver.findElement(By.xpath("//*[@id=\"pim\"]/a/span"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
	
	
	driver.findElement(By.name("txtEmpLastName")).sendKeys("ide");
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("sel");
	WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
	fileInput.sendKeys("C:\\Users\\surya\\Documents\\Scanned Documents\\Welcome Scan.jpg");
	driver.findElement(By.id("btnEdit")).click();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
}
}
