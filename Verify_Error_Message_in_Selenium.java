package webdriverExamples;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Verify_Error_Message_in_Selenium {
	
	@Test
	public void TestError( ) {
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver 87.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admi");
		driver.findElement(By.name("Submit")).click();
		
		// this will capture error message
		
		String actual_msg = driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[2]/strong/font")).getText();
		
		// store message in variable
		String expect = "plz enter valid email";
		
		//verify error message
		Assert.assertEquals(actual_msg, expect);
		
	}

}
