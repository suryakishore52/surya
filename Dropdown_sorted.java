package webdriverExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_sorted {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.name("Submit"))).build().perform();
		
	    driver.switchTo().frame("rightMenu");
	    WebElement list = driver.findElement(By.id("loc_code"));
	    Select dropdown = new Select(list);
	    
	    List<WebElement>allOptions = dropdown.getOptions();
	    List options = new ArrayList();
	    
	    for(WebElement optionElement : allOptions) {
	    	options.add(optionElement.getText());
	    }
	    System.out.println("Options in dropdown : "+options);
	    List tempList = new ArrayList<>(options);
	    Collections.sort(tempList);
	    System.out.println("Sorted List" +tempList);
	    boolean ifSortedAscending = options.equals(tempList);
	    
	    if(ifSortedAscending) {
	    	System.out.println("List is sorted");
	    }
	    else
	    	System.out.println("List is not sorted");
	    driver.quit();
	    }
		
		
	}

