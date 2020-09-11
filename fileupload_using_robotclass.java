package webdriverExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileupload_using_robotclass {

	public static void main(String args[]) throws AWTException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/index.php");
		
		Actions act = new Actions(driver);
		act.click(driver.findElement(By.xpath("//*[@id=\"photofile\"]"))).build().perform();
		
		Robot robot = new Robot();
		StringSelection select = new StringSelection("C:\\Users\\surya\\Desktop\\Desk\\Projects\\Water Overflow Alarm.jpg");
		
		// to copy file path
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
		
		//to paste file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
