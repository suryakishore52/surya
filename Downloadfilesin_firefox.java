package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Downloadfilesin_firefox {
public static void main(String args[]) {
	FirefoxProfile profile = new FirefoxProfile();
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk","text/plain");
	profile.setPreference("browser.download.manager.showWhenStarting","false");
	profile.setPreference("pdfjs.disabled", true);
	
	FirefoxOptions option = new FirefoxOptions();
	option.setProfile(profile);
	System.setProperty("webdriver.gecko.driver","E:\\chromedriver.exe");
	WebDriver driver = new FirefoxDriver(option);
	driver.get("");
	driver.findElement(By.xpath("")).click();
	
}
}
