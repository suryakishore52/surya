package webdriverExamples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Read_username_password_from_excel {
	public static void main(String args[]) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		FileInputStream file = new FileInputStream("E:\\logincredentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet  = workbook.getSheet("sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		for (int i=1; i<=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			String username = row.getCell(0).getStringCellValue();
			String password  = row.getCell(1).getStringCellValue();
			
			driver.findElement(By.name("txtUserName")).sendKeys(username);
	        driver.findElement(By.name("txtPassword")).sendKeys(password);
	        driver.findElement(By.name("Submit")).click();
	        
	        String message = driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[2]/strong/font")).getText();
			System.out.println(message);
			
	        if(message.equalsIgnoreCase("valid user")) {
	        	sheet.getRow(i).createCell(2).setCellValue("pass");
	        }
	        else {
	        	sheet.getRow(i).createCell(2).setCellValue("fail");
	        }
	        
	        // to add data to file
	        
	       // FileOutputStream fout = new FileOutputStream("E:\\logincredentials.xlsx");
	       // workbook.write(fout);
	        
	        driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	        
	        	}
			//workbook.close();
		driver.close();
		}
	}


