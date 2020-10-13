package webdriverExamples;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Jqueryui_examples_practice {
	public static void main(String args[]) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// element to be draggable:
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(2000);
		assertEquals("Draggable | jQuery UI",driver.getTitle());
		driver.switchTo().frame(0);
		Actions a=new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		a.clickAndHold(source).build().perform();
		a.dragAndDropBy(source, 300, 150).build().perform();
		Thread.sleep(5000);
		
		
		// element to be selectable:
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		
		List<WebElement> list = driver.findElements(By.xpath("//ol[@id='selectable']/*")); 
		 
		 Actions actions = new Actions(driver);
				 actions.keyDown(Keys.CONTROL)
				        .click(list.get(0))
				        .click(list.get(2))
				        .click(list.get(4))
				        .keyUp(Keys.CONTROL)
				        .build()
				        .perform();
		 
		Thread.sleep(3000);
		
		
		
		// elements to be reorder using mouse:
		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);
		List<WebElement> list1 = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		Actions action = new Actions(driver);
		WebElement target = list1.get(0);
		WebElement dest   = list1.get(3);
		WebElement target1 = list1.get(1);
		WebElement dest1 = list1.get(4);
		
		action.click(target).clickAndHold().moveToElement(dest).moveByOffset(0,10).release().build().perform();
		action.click(target1).clickAndHold().moveToElement(dest1).moveByOffset(0,10).release().build().perform();
		Thread.sleep(3000);
		driver.close();
		
	}

	}
