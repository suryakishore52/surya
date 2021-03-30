package webdriverExamples;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class Headlessbrowser_using_phantomjs {

	//(source: https://www.softwaretestingmaterial.com/headless-browser-testing-using-phantomjsdriver/)
	
/*	
	// to declare and initialize phantomjsDriver
	WebDriver driver = new PhanthomJSDriver(BrowserVersion.FIREFOX_3);
	*/
	
	@Test
	public void phantomJSDriver() throws Exception{
		//Set the path of the phantomjs.exe file in the properties
		System.setProperty("phantomjs.binary.path", "D:\\Selenium\\Drivers\\phantomjs.exe");
		// To declare and initialize PhantomJSDriver
		WebDriver driver = new PhantomJSDriver();
		// Download link is http://phantomjs.org/download.html
		// Set implicit wait 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Open "Google.com and search SoftwareTestingMaterial.com"
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		// To locate the searchbox using its name
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		
		// Get the title of the site and store it in the variable Title
		String Title = driver.getTitle();
		// Print the title
		System.out.println("I am at " +Title);
	}
}
