package webdriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
public class Windowhandle {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("E:\\Html files\\multiplewindows.html");
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
	driver.findElement(By.id("btn2")).click();
	Thread.sleep(5000);
	driver.findElement(By.id("btn3")).click();
	ArrayList<String> wind = new ArrayList<String>(driver.getWindowHandles());
	Thread.sleep(5000);
	driver.switchTo().window(wind.get(0));
	Thread.sleep(5000);
	driver.quit();
}
}
