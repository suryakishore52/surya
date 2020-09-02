package webdriverExamples;
import org.openqa.selenium.By;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Selenium_headless_browser_test {
public static void main(String args[]) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	//ChromeOptions options = new ChromeOptions();
	//options.addArguments("headless");
	 // options.setHeadless(true);
	WebDriver driver = new ChromeDriver();
	// WebDriver driver = new HtmlUnitDriver();
	        
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getCurrentUrl());

	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println(driver.getTitle());

	Thread.sleep(2000);

	WebElement element = driver.findElement(By.linkText("PIM"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
    driver.findElement(By.linkText("Add Employee")).click();
   
	
	Thread.sleep(3000);
	driver.switchTo().frame("rightMenu");
	
	driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\surya\\Desktop\\Desk\\Projects\\Water Overflow Alarm.jpg");
	
	Thread.sleep(3000);
	
	driver.close();
	

}
}
