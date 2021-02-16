package webdriverExamples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploaMultipleFiles_using_Autoit {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver 87.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("")).click();
		Runtime.getRuntime().exec(" "+" "+" ");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("")).click();
		Runtime.getRuntime().exec(" "+" "+" ");
	}

}
