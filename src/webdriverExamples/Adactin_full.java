package webdriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
public class Adactin_full {
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactin.com/HotelApp/index.php");
		System.out.println(driver.getTitle());
		System.out.println("browser opened");
		driver.findElement(By.name("username")).sendKeys("sureshbabu1");
		driver.findElement(By.name("password")).sendKeys("suresh");
		driver.findElement(By.name("login")).click();
		System.out.println("login completed");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Search Hotel")).click();
		Select st = new Select(driver.findElement(By.id("location")));
		st.selectByVisibleText("Sydney");
		Select st1 = new Select(driver.findElement(By.id("hotels")));
		st1.selectByVisibleText("Hotel Creek");
		Select st2 = new Select(driver.findElement(By.id("room_type")));
		st2.selectByVisibleText("Deluxe");
		Select st3 = new Select(driver.findElement(By.id("room_nos")));
		st3.selectByVisibleText("3 - Three");
		driver.findElement(By.id("datepick_in")).sendKeys("01/05/2020");
		driver.findElement(By.id("datepick_out")).sendKeys("02/05/2020");
		Select st4 = new Select(driver.findElement(By.id("adult_room")));
		st4.selectByVisibleText("3 - Three");
		Select st5 = new Select(driver.findElement(By.id("child_room")));
		st5.selectByVisibleText("4 - Four");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("hi");
		driver.findElement(By.name("last_name")).sendKeys("key");
		driver.findElement(By.name("address")).sendKeys("hyderaddkkv");
		driver.findElement(By.name("cc_num")).sendKeys("1234567890159764");
		Select st6 = new Select(driver.findElement(By.id("cc_type")));
		st6.selectByVisibleText("VISA");
		Select st7 = new Select(driver.findElement(By.id("cc_exp_month")));
		st7.selectByVisibleText("June");
		Select st8 = new Select(driver.findElement(By.id("cc_exp_year")));
		st8.selectByVisibleText("2020");
		driver.findElement(By.name("cc_cvv")).sendKeys("149");
		driver.findElement(By.name("book_now")).click();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).click();
		driver.findElement(By.name("order_id_text")).sendKeys("7611FY9F7X");
		driver.findElement(By.name("search_hotel_id")).click();
		driver.findElement(By.name("ids[]")).click();
		driver.findElement(By.name("cancelall")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
		System.out.println("logout completed");
		driver.close();
}
}
