package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tc_003 {
public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(2000);
	System.out.println("login completed");
	
	Thread.sleep(1500);
	driver.switchTo().frame("rightMenu");
	Select st = new Select(driver.findElement(By.name("loc_code")));
	st.selectByVisibleText("Emp. ID");
	driver.findElement(By.name("loc_name")).sendKeys("0010");
	driver.findElement(By.xpath("//form[@id=\"standardView\"]/div[2]/input[2]")).click();
	driver.findElement(By.xpath("//form[@id=\"standardView\"]/table/tbody/tr/td[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//form[@id='standardView']/div[3]/div/input[2]")).click();
	System.out.println("Del emp");
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
	
	
	
}
}

