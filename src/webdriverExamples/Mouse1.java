package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class Mouse1 {
public static void main(String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	
	Thread.sleep(3000);
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"admin\"]/a/span"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[11]/a/span")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	driver.close();
	
}
}
