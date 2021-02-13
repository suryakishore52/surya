package webdriverExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_chrome_notifications {

	public static void main(String args[]) {
	
		// create object of HashMap class
		Map<String, Object> prefs = new HashMap<String, Object>();
		
		
		// set notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		
		// create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();
		
		//set experimental option
		options.setExperimentalOption("prefs", prefs);
		
		//pass the options object in Chrome driver
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver 87.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("")).click();
		
		driver.close();
		
	}
}
