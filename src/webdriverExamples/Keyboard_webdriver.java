package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
public class Keyboard_webdriver {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	System.out.println("down arrow for 1st time");
	driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(1000);
	System.out.println("down arrow for 2nd time");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	
	System.out.println("Enter");
	
	driver.close();
	
}
}
