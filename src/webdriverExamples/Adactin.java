package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Adactin {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\drivers\\\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://adactin.com/HotelApp/index.php");
	driver.findElement(By.name("username")).sendKeys("sureshbabu1");
	driver.findElement(By.name("password")).sendKeys("suresh");
	driver.findElement(By.name("login")).click();
	System.out.println("Login completed");
	driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
	System.out.println("Logout completed");
	driver.close();
}
}
