package webdriverExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Click_button_withsame_xpath {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("BE_flight_origin_city")).click();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("BE_flight_arrival_city")).click();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("BE_flight_origin_date")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#\\33 0\\/10\\/2020")).click();
		
		driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/span")).click();
		driver.findElement(By.className("ddSpinnerPlus")).click();
		driver.findElement(By.id("BE_flight_flsearch_btn")).click();
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("#BOMDELG81391SA20201030_G8API > div > div.flight-det.table.full-width.clearfix > div.booking-sec.pr.v-aligm-t.pt-20.pr-24 > div > div.pr.tipsy.mb-8.book-button.i-b.ml-5.v-aligm-m > button")).click();
		
		System.out.print("Enabled");
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"fare-BOMDELG81391SA20201030_G8API\"]/button")));

        driver.findElement(By.xpath("//*[@id=\"fare-BOMDELG81391SA20201030_G8API\"]/button")).click();
		
		
	}

}
