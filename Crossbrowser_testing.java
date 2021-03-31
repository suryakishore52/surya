package webdriverExamples;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Crossbrowser_testing {

	public WebDriver driver;
	public static final String USERNAME = "rajkumar";
	public static final String AUTOMATE_KEY = "rajkumaraccesskey";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";
	
	@Test(dataProvider="EnvironmentDetails")
	public void openSTM(Platform platform, String browserName, String browserVersion) throws Exception {
                // To execute scripts through remote server or grid on mulitple browsers, we need to set capabilities of platform, version etc., to run the scripts
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setPlatform(Platform.WINDOWS);
		capability.setBrowserName("chrome");
		capability.setVersion("89");
		capability.setCapability("browserstack.debug", "true");
		// Creatng URL object
		URL browserStackUrl = new URL(URL);
		
		// Create object of driver. We execute scripts remotely. So we use RemoteWebDriver
		//There are many constructors to remotewebdriver
                //To pass URL object and Capabilities object, use the below mentioned constructor
                //RemoteWebDriver(URL remoteAddress, Capabilities desiredCapabilities)
		driver = new RemoteWebDriver (browserStackUrl, capability);
		//Implicit wait for 30 seconds
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// to open url
		driver.get("https://www.softwaretestingmaterial.com");
		
		// to capture screenshot
		driver = (RemoteWebDriver) new Augmenter().augment(driver);
		File srcFile = (File) ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("/location/to/screenshot.png"));
		
		// To get the current url
		String actualURL = driver.getCurrentUrl();
		// To print the URL
		System.out.println("URL is "+actualURL);
		driver.quit();
		String expectedURL = "https://www.softwaretestingmaterial.com/";
                //Assert to verify the actual and expected values
		Assert.assertEquals(actualURL, expectedURL,"Expected and Actual are not same");		
	}
	
	// passing parallel = true to run the test scripts in parallel
    // DataProvider supports Object return type 
    // Passing values such as MAC with Chrome 62, Windows 8 with Chrome 62, and Windows 7 with firefox 57
@DataProvider(name="EnvironmentDetails", parallel=true)
public Object[][] getData(){
	
	Object[][] testData = new Object[][]{
		{Platform.MAC, "chrome", "62.0"},
		{Platform.WIN8, "chrome", "62.0"},
		{Platform.WINDOWS, "firefox", "57"}
	};
	
	return testData;		
}
}
