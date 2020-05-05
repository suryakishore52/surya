package webdriverExamples;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Fileupload {
public static void main(String args[])throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(1500);
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.xpath("//input[@value='Add']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("selenium");
	driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("webdriver");
	WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
	fileInput.sendKeys("C:\\Users\\surya\\Documents\\Scanned Documents\\Welcome Scan.jpg");
	Thread.sleep(1500);
	System.out.println("File uploaded successfully");
	driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
	Thread.sleep(1500);
	System.out.println("new empid");
	driver.switchTo().defaultContent();
	driver.findElement(By.linkText("Logout")).click();
	System.out.println("Logout completed");
	driver.close();
	
	
	
	
}
}
