package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_elements_Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","E:\\\\chrome driver\\\\chromedriver 87.exe");
     WebDriver driver = new ChromeDriver();
     
     driver.manage().window().maximize();
     driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
     
     JavascriptExecutor js = (JavascriptExecutor)driver;
     
     WebElement username = driver.findElement(By.name("txtUserName"));
     js.executeScript("arguments[0].setAttribute('style', 'border: solid 2px red')", username);
     
	}

}
