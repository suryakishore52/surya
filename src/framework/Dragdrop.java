package framework;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dragdrop {
WebDriver driver;

@Test
public void testDragDrop() throws Exception{
	driver.manage().window().maximize();
	driver.get("http://jqueryui.com/droppable/");
	Thread.sleep(1500);
	assertEquals("Droppable | jQuery UI",driver.getTitle());
			driver.switchTo().frame(0);
			Actions a= new Actions(driver);
			a.dragAndDrop(driver.findElement(By.id("draggable")),
			driver.findElement(By.id("droppable"))).build().perform();
}
@BeforeClass
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Drivers\\\\\\\\chromedriver.exe");
	driver = new ChromeDriver();
}
@AfterClass
public void tearDown() {
	driver.quit();

}
}
