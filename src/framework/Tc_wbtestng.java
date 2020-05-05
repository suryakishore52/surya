package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tc_wbtestng {
	WebDriver driver;
	@BeforeClass
	public void Startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void tc001() throws Exception{
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		Reporter.log(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Reporter.log("login complete");
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("logout complete");
	}
}