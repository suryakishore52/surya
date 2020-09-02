package webdriverExamples;
import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String args[]) {

	 // objects and variables instantiation
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    String url = ("http://127.0.0.1/orangehrm-2.6/login.php");
    String username = "admin";
    String password = "admin";
    // launch the chrome browser and open the application url
    driver.get(url);

    // maximize the browser window
    driver.manage().window().maximize();
    
    // declare and initialize the variable to store the expected title of the webpage.
    String expectedTitle = "OrangeHRM - New Level of HR Management";

    // fetch the title of the web page and save it into a string variable
    String actualTitle = driver.getTitle();

    // compare the expected title of the page with the actual title of the page and print the result
    if (expectedTitle.equals(actualTitle))
    {
           System.out.println("Verification Successful - The correct title is displayed on the web page.");
    }
    else
    {
           System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
    }

    // verify if the “Google Search” button is displayed and print the result
   
    boolean submitbuttonPresence=driver.findElement(By.name("Submit")).isDisplayed();
    System.out.println(submitbuttonPresence);

    // enter the keyword in the “Google Search” text box by which we would want to make the request
    WebElement searchTextBox = driver.findElement(By.name("txtUserName"));
    searchTextBox.clear();
    searchTextBox.sendKeys("username");
    WebElement searchPassBox = driver.findElement(By.name("txtPassword"));
    searchPassBox.sendKeys("password");

    /* verify that the “Search button” is displayed and enabled
    boolean searchIconPresence = driver.findElement(By.id("gbqfb")).isDisplayed();
    boolean searchIconEnabled = driver.findElement(By.id("gbqfb")).isEnabled(); */

    if (submitbuttonPresence==true )
    {
           // click on the search button
           WebElement searchIcon = driver.findElement(By.name("Submit"));
           searchIcon.click();
    }
    
    // close the web browser
    driver.close();
    System.out.println("Test script executed successfully.");

    // terminate the program
    System.exit(0);
}
}
