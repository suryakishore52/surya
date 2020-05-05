package webdriverExamples;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Frame {
	
	    public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		
		Thread.sleep(3000L);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(1000); 
		//mouseover on pim mainmenu
		WebElement element = driver.findElement(By.xpath("//li[@id=\"admin\"]/a/span"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id=\"admin\"]/ul/li[11]/a/span")).click();
		
		Thread.sleep(3000L);
		//clicking on addemployee submenu link
		WebElement element1 = driver.findElement(By.linkText("PIM"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(element1).perform();
		driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[1]/a/span")).click();
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"leave\"]/a/span"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(element2).perform();
		driver.findElement(By.xpath("//*[@id=\"leave\"]/ul/li[5]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"time\"]/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id=\"benefits\"]/a/span")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//li[@id=\"recruit\"]/a/span")).click();
		Thread.sleep(1000);
		WebElement element6 = driver.findElement(By.xpath("//li[@id=\"perform\"]/a/span"));
		Actions action6 = new Actions(driver);
		action6.moveToElement(element6).perform();
		driver.findElement(By.xpath("//li[@id=\"perform\"]/ul/li[4]/a/span")).click();
		Thread.sleep(1000);
		WebElement element7 = driver.findElement(By.xpath("//li[@id=\"report\"]/a/span"));
		Actions action7 = new Actions(driver);
		action7.moveToElement(element7).perform();
		driver.findElement(By.xpath("//li[@id=\"report\"]/ul/li/a/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@id=\"help\"]/a/span")).click();
		
driver.findElement(By.linkText("Logout")).click();
		
		Thread.sleep(3000);
		System.out.println("Clicked on submenu");
		driver.quit();
		}
		
	}

