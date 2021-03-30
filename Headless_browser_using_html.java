package webdriverExamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Headless_browser_using_html {
	
	@Test
	public void htmlUnitDriver() throws Exception{
		// To declare and initialize HtmlUnitDriver
		WebDriver driver = new HtmlUnitDriver();
		//WebDriver driver = new HtmlUnitDriver(BrowserVersion.)
		// Set implicit wait 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open "Google.com and search SoftwareTestingMaterial.com"
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		String Title = driver.getTitle();
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		Thread.sleep(1000);
				
		// Print the title
		System.out.println("I am at " +Title);
	}

}
