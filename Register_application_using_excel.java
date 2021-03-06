package webdriverExamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_application_using_excel {
	public static void main(String args[]) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8084/kothaAbhishekproject/");
		
		FileInputStream file = new FileInputStream("E:\\logincredentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowcount = sheet.getLastRowNum();
		//System.out.println(rowcount);
		
		for(int i=0; i<=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			String name = row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue();
			String email = row.getCell(2).getStringCellValue();
			int mobile =(int) row.getCell(3).getNumericCellValue();  //typecasting
			String gender = row.getCell(4).getStringCellValue();
			
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys(name);
	        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
	        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
	        driver.findElement(By.xpath("//input[@name='number']")).sendKeys(String.valueOf(mobile));
	        
	      
	        List<WebElement> radiobutton = driver.findElements(By.name("gender"));
	        int radiosize = radiobutton.size();
	        
	        for(int  j=0; j<radiosize; j++) {
	        String value = radiobutton.get(j).getAttribute("value");
	        	
	        if(value.equalsIgnoreCase(gender)) {
	         radiobutton.get(j).click();
	        	}
	        }
	        
	        driver.findElement(By.xpath("//input[@name='Register']")).click();
	       
	        driver.get("http://localhost:8084/kothaAbhishekproject/");
			
		}
			driver.close();
	}

}


