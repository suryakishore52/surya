package webdriverExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dates_in_other_month {
public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/datepicker/#other-months");
	
	String date = "31-September-2020";
	String arr[] = date.split("-");
	
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	
	String month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
	String year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
	
	boolean flag = false;   // to stop program execution 
	
	while (true) {
		if(month.contentEquals(arr[1]) && year.equals(arr[2])) {
		
			List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[not(contains(@class,'ui-datepicker-other-month'))]"));
			int size = days.size();
			
			for(int i=0; i<size; i++) {   					 //iterate list
				WebElement currentday = days.get(i);        // reads current webelement
				String day = currentday.getText();
				
				if (day.equals(arr[0])) {
					currentday.click();
					flag=true;
					
					break;				// stops for loop
					
					}
			}
			if(flag) {
				System.out.println("success");
				break;                          // stops while loop
			}else {
				System.out.println("please enter valid date");
				driver.close();
				break;                           // stops while loop
			}
		}
		else {
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
			month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
			year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();
			
			}
	}
	
	}
}
