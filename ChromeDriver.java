package javaexamples;
interface WebDriver{
	public void openapplication();
	public void closeapplication();
}
class FirefoxDriver implements WebDriver{
	public void openapplication() {
		System.out.println("open firefox");
	}
	public void closeapplication() {
		System.out.println("close firefox");
	}
}
public class ChromeDriver implements WebDriver {
public void openapplication() {
System.out.println("open chrome");
}
public void closeapplication() {
	System.out.println("close chrome");
	
}
public static void main(String args[]) {
	FirefoxDriver ff = new FirefoxDriver();
	ff.openapplication(); 
	ff.closeapplication();
	ChromeDriver ch = new ChromeDriver();
	ch.openapplication();
	ch.closeapplication();
	WebDriver driver= new FirefoxDriver();
	driver.openapplication();
	driver.closeapplication();
	WebDriver driver1 = new ChromeDriver();
	driver1. openapplication();
	driver1.closeapplication();
	
}
}
