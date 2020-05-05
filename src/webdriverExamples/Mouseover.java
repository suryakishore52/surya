package webdriverExamples;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouseover {
	
	
	public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.manage().window().maximize();
	Thread.sleep(3000L);
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	//mouseover on pim mainmenu
	WebElement element = driver.findElement(By.linkText("PIM"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	Thread.sleep(3000L);
	//clicking on addemployee submenu link
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(3000);
	System.out.println("Clicked on submenu");
	driver.quit();
	}
	}

