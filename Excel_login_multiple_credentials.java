package webdriverExamples;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;


public class Excel_login_multiple_credentials {
	
	public static XSSFSheet excelSheet;
	public static XSSFCell  cell;
	public static WebDriver driver;
	
	public static void main(String args[]) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","E:\\chrome driver\\chromedriver89.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream file = new FileInputStream("E:\\Excel jars\\login cred.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet  = workbook.getSheet("sheet1");
		
		for (int i=1; i<=6; i++) {
			driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
			
			XSSFRow row = sheet.getRow(i);
			String username = row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue(); 
			
			driver.findElement(By.name("txtUserName")).sendKeys(username);
			driver.findElement(By.name("txtPassword")).sendKeys(password);
			driver.findElement(By.name("Submit")).click();
			
			
			 try{
				 Thread.sleep(1000);
				Alert a = driver.switchTo().alert();
				System.out.println(a.getText());
				 a.accept();
				 }catch (Exception e){
				 System.out.println(e.getMessage());
				 }    
			
		}
		
		driver.close();
		
            }
	}