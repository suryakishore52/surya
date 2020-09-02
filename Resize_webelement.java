package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Resize_webelement {
public static void main (String args[]) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("http://jqueryui.com/resizable/");
	
	System.out.println(driver.getTitle());
    driver.switchTo().frame(0);
    
    WebElement target = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='resizable']/div[3]")));
    new Actions(driver).dragAndDropBy(target, 250, 150).build().perform();
    System.out.println("resing of element completed");
    
    driver.switchTo().defaultContent();     
    driver.close();
}

}

