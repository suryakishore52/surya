package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
			
public class Frames {
	public static void main(String args[]) throws Exception{
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(2000);
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@name='txtEmpFirstName']")).sendKeys("selenium");
	driver.findElement(By.xpath("//input[@name='txtEmpLastName']")).sendKeys("sen");
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	Thread.sleep(1000);
	System.out.println("New Emp added");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(1000);
	System.out.println("Logout completed");
	driver.close();
	
	
	}

}
