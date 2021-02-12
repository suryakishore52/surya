package webdriverExamples;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bootstrap_dropdown {
	
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver 87.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
		
		for (WebElement ele : list)
		{
			System.out.println("Values" + ele.getAttribute("innerHTML"));
			
			if (ele.getAttribute("innerHTML").contains("JavaScript")) {
				
				ele.click();
				
				break;
			}
			
		}
	}

}







	
	


