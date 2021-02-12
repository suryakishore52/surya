package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_scroll {

	public static void main(String args[]) throws InterruptedException {
     
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver 87.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("sureshbabu1");
		driver.findElement(By.name("password")).sendKeys("suresh");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Booked Itinerary")).click();
		Thread.sleep(5000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		WebElement element = driver.findElement(By.cssSelector("#order_id_371032"));
		 je.executeScript("arguments[0].scrollIntoView(true);", element);
		 
		 System.out.println(element.getText());
		
		 Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}
}
