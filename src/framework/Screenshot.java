package framework;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot {
	WebDriver driver;

@BeforeClass
	public void SetUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Drivers\\\\chromedriver.exe");
	driver = new ChromeDriver();
}
@AfterClass
public void tearDown() {
	driver.quit();
}
@Test
public void screenshot() throws Exception{
	try {
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
			driver.findElement(By.name("txtUserName")).sendKeys("admin");
			driver.findElement(By.name("txtPassword")).sendKeys("admin");
			driver.findElement(By.name("Submit")).click();
			Thread.sleep(2000);
			WebElement element = driver.findElement(By.linkText("PIM"));
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
			Thread.sleep(3000L);
			driver.findElement(By.linkText("Add Employee123")).click();
			Thread.sleep(4000);
			System.out.println("Clicked on submenu");
}
catch(Exception e) {
	File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f1,new File("E:\\TestResult.jpg"));   
	
}
}
}



