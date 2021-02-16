package webdriverExamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_page_using_java_script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver 87.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		Thread.sleep(2000);
		
		// this will scroll page 400pixel vertical
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");

	}

}
