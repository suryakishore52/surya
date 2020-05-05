package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("E:\\Html files\\WebTable.html");
		System.out.println(driver.getTitle());
		
		int row=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
		int col=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
		int row_col=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr/td")).size();
		System.out.println(row);
		System.out.println(col);
		System.out.println(row_col);
		//Data -- cell
		String cell = driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr[2]/td[2]")).getText();
		System.out.println(cell);
		//Data -- whole table
		for(int i=1; i<=7; i++) {
			String data = driver.findElement(By.xpath("//table[@id='idCourse']/tbody/tr["+i+"]")).getText();
			Thread.sleep(1500);
			System.out.println(data);
		}
		driver.close();
}
}