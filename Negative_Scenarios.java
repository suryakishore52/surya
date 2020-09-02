package webdriverExamples;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Negative_Scenarios {
	static int i;
	static String username, password, iteration;
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	for (i = 1; i <= 2; i++){
	if (i == 1) {
	username = "admin";
	password = "admin";
	iteration = "Iteration 1:";
	}
	else if(i == 2){
	username = "admina";
	password = "admin@123a";
	iteration = "Iteration 2:";
	}

	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	String url = driver.getCurrentUrl();
	
	if (url.contains("http://127.0.0.1/orangehrm-2.6/login.php")){
		
		driver.findElement(By.name("txtUserName")).clear();
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		
		System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Admin Login Successful -Passed");
		assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
		System.out.println("welcome admin");
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(2000);
	}
	else if (url.contains("http://127.0.0.1/orangehrm-2.6/login.php")){
	String ErrorMessage = driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[2]/strong/font")).getText();
	if (ErrorMessage.contains("Invalid Login.")){
	System.out.println(iteration + ("Input Data: ") + username + ", "+ password + " Handling InvalidInputs -not Passed");
	driver.quit();}
	else {
	System.out.println(iteration + "- Failed");
	}
	}
	}
	
	driver.quit();
	}
	}

