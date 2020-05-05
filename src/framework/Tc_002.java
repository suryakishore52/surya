package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Tc_002 {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id=\"standardView\"]/div[3]/div[1]/input[1]")).click();
		driver.findElement(By.name("txtEmpLastName")).sendKeys("adactin");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("adact");
		Thread.sleep(2000);
		WebElement fileInput = driver.findElement(By.xpath("//input[@type='file'][@name='photofile']"));
		fileInput.sendKeys("C:\\Users\\surya\\Documents\\Scanned Documents\\Welcome Scan.jpg");
		System.out.println("upload complete");
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		Thread.sleep(1500);
		System.out.println("new empid");
		driver.switchTo().defaultContent();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logout completed");
		driver.close();
		
		
	}
	}

