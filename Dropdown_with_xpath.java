package webdriverExamples;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class Dropdown_with_xpath {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.xpath("//table[@id=\"Table_01\"]/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//table[@id=\"Table_01\"]/tbody/tr/td[2]/table/tbody/tr[3]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//table[@id=\"Table_01\"]/tbody/tr/td[2]/table/tbody/tr[4]/td/input")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("rightMenu");
		
		driver.findElement(By.name("loc_code")).sendKeys("Employment status");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	}

}
  