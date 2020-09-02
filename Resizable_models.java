package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable_models {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		 
		Actions act = new Actions(driver);
		 
		WebElement source = driver.findElement(By.xpath("//*[@id=\'resizable\']/div[3]"));
		//Thread.sleep(2000);
        act.dragAndDropBy(source, 250, 500).build().perform();
	        
	    Thread.sleep(5000);
		driver.close();
	}

}
