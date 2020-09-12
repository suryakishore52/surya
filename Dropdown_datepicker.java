package webdriverExamples;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_datepicker {
public static void main(String args[]) {
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/datepicker/#dropdown-month-year");
	
	
	
	// (or) model-1
	
		String date = "1-Jan-2021";
		String arr[] = date.split("-");
		
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
	
	
	Select month = new Select(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]")));
	month.selectByVisibleText(arr[1]);  
	
	Select year = new Select(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")));
	year.selectByVisibleText(arr[2]); 
	
	List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));

	int size = days.size();
	
	boolean flag = false;
	
	for(int i=0; i<size; i++){
	WebElement currentday = days.get(i);
	String day =  currentday.getText();
	
	if(day.equals(arr[0])){
	currentday.click();
	flag=true;
	break;
	}
	}
	if(flag){
	System.out.println("sucess");
	
	}else{
		driver.close();
	System.out.println("please enter a valid date");
	
	}
	}
	}
	
	// model-2
	 
	 /*
	  *
	  *
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
	
	Select year = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")));
	year.selectByValue("2030");
	
	Select month = new Select(driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")));
	month.selectByVisibleText("Jun");
	
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]/a")).click();
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
	
}
}	*/
