package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_driven_framework_excel {
	    //ChromeDriver driver;
    
		//@Test(dataProvider="testdata")
        public void DemoProject(String username, String password) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://127.0.0.1/orangehrm-2.6/login.php/");
        driver.findElement(By.name("txtUserName")).sendKeys(username);
        driver.findElement(By.name("txtPassword")).sendKeys(password);
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(5000);
        Assert.assertTrue(driver.getTitle().matches("OrangeHRM - New Level Of HR Management"), "Invalid credentials");
        System.out.println("Login successful");
        //}
		
       // @AfterMethod
        //void ProgramTermination() {
       //
        //driver.quit();
        //} 
        
       // @DataProvider(name="testdata")
       // public Object[][]   TestDataFeed() {
        	
        ReadExcelFile config = new ReadExcelFile("E:\\logincredentials.xlsx");
        	
        int rows = config.getRowCount(0);
        	
        Object[][] credentials = new Object[rows][2];
        	
        for(int i=0; i<=rows; i++) {
        credentials[i][0]  = config.getData(0, i, 0);
        credentials[i][1]  = config.getData(0, i, 1);
        	//}
        	
       // return credentials;
        driver.quit();
        }
        }
        
          }
        
