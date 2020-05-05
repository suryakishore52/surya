package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class New_Orangehrm {
	public static void main(String args[]) throws Exception {
		//launch browser
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println("application opened");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUsername")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	System.out.println("login completed");
	driver.findElement(By.xpath("//a[@id=\"welcome\"]"));
	System.out.println("Welcome Admin");
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	driver.findElement(By.xpath("//*[@id=\"menu_admin_nationality\"]")).click();
	Thread.sleep(1500);
	WebElement element1 = driver.findElement(By.id("welcome"));
	driver.findElement(By.id("welcome")).click();
	
	driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
	System.out.println("logout completed");
	Thread.sleep(3000);
	driver.close();
}
}
