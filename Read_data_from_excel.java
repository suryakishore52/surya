package webdriverExamples;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_data_from_excel {
	public static void main(String args[]) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php/");
		
		FileInputStream file = new FileInputStream("E:\\logincredentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowcount = sheet.getLastRowNum();
		//System.out.println(rowcount);
		
		for(int i=0; i<=rowcount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			String name = row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue();
			//int mobile =(int) row.getCell(2).getNumericCellValue();  //typecasting
			//String name = row.getCell(3).getStringCellValue();
			
			driver.findElement(By.name("txtUserName")).sendKeys(name);
	        driver.findElement(By.name("txtPassword")).sendKeys(password);
	        //driver.findElement(By.xpath("")).sendKeys(String.valueof(mobile));
	        //List<WebElement> radiobutton = driver.findElements(By.name("gender"));
	        //int radiosize = radiobutton.size();
	        
	        //for(int  j=0; j<radiosize; j++) {
	        	//String value = radiobutton.get(j).getAttribute("value");
	        	
	        	//if(value.equalsIgnoreCase(gender)) {
	        		//radiobutton.get(j).click();
	        	//}
	        //}
	        
	        driver.findElement(By.name("Submit")).click();
	       // driver.findElement(By.linkText("Logout")).click();
	        
	        
	        driver.get("http://127.0.0.1/orangehrm-2.6/login.php/");
			
		}
			driver.close();
	}

}
