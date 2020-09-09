package webdriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_selection {
	public static void main(String args[]) {
		
		//(reference: kothaabhishek.co.in)
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		String date = "20-January-1992";
		String arr[]= date.split("-");
		
		driver.switchTo().frame(0);
		
		// date text box
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		String month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
		String year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();

		// to identify how many no.of rows
		int rows = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();
		int cols = 7;
		
		boolean flag = false;
		
				while (true) {
					
					if(month.equals(arr[1]) && year.equals(arr[2]))   {
						for(int i=1; i<=rows; i++) {       //for rows tr
							for(int j=1; j<=cols; j++ ) {   // for columns 
								
					String day = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]")).getText();
								
					if(day.equals(arr[0])) {
						driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]")).click();
						flag = true;
						break;				// stops columns (inner for loop)
					}
							}
							if(flag) {   //stops rows
								break;   // stops rows (outer for loop)
							}
						}
						if(flag) {
							System.out.println("success");
							break;        //to stop while loop
						}
						else {
							System.out.println("Please Enter Correct Date");
							driver.close();
							break;
						}
					}
					else {
						   // to click on right arrow button in calender 
					      driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
					    //*[@id="ui-datepicker-div"]/div/a[2]/span
					      
						  month = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[1]")).getText();
						  year = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/span[2]")).getText();


					}
				}
		
	}

}
