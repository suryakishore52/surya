package Lin;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Register_multiple_users {

	 public static HSSFSheet excelSheet;
	 public static HSSFCell cell;
	 public static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException, IOException {
		 
	  System.setProperty("webdriver.chrome.driver", "E:\\Eclipse Testing\\chrome driver\\chromedriver 91.exe");
	  driver = new ChromeDriver();
	  
	  excelSheet = readExcel("C:\\Users\\surya\\Downloads\\Book1.xls", "Sheet1");
	  
	  
	   FileInputStream ExcelFile = new FileInputStream("C:\\Users\\surya\\Downloads\\Book1.xls");
	   // Access the required test data sheet
	   HSSFWorkbook ExcelWBook = new HSSFWorkbook(ExcelFile);
	   HSSFSheet excelSheet = ExcelWBook.getSheet("Sheet1");
	  
	  
	  
	   for (int i = 0; i<= 4; i++) {
	   // Load URL getting.
	   driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	   
	   // Locate element for login and password input and send data to inputs.
	   
	   driver.findElement(By.name("txtUserName")).sendKeys("admin");
	   driver.findElement(By.name("txtPassword")).sendKeys("admin");
	     
	   // Click to the button for login.
	   driver.findElement(By.name("Submit")).click();
	  
	   
	    driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//form[@id='standardView']/div[3]/div[1]/input[1]")).click();
		
		driver.findElement(By.name("txtEmpLastName"))
		.sendKeys(excelSheet.getRow(i).getCell(0).getStringCellValue());
		driver.findElement(By.name("txtEmpFirstName"))
		.sendKeys(excelSheet.getRow(i).getCell(1).getStringCellValue());
		driver.findElement(By.id("btnEdit")).click();
		driver.findElement(By.xpath("/html/body/div[5]/input")).click();
	
		driver.switchTo().defaultContent();
		
	    driver.findElement(By.linkText("Logout")).click();
		
	  }
	  driver.close();
	 }
	public static HSSFSheet readExcel(String Path, String SheetName) {
	  try {
	   
	  
	  } 
	  catch (Exception e) {
	   System.out.println(e);
	  }        
	  return excelSheet;
	
	}
	
	 }
	

