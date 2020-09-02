package webdriverExamples;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Identifying_broken_links {
public static void main(String args[]) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://jqueryui.com/");
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int size = links.size();
	
	System.out.println(size);
	
	for(int i=0; i<size; i++) {
		WebElement element = links.get(i);
		String url = element.getAttribute("href");
		
		URL link = new URL(url);
		HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
		
		httpcon.connect();
		int rescode = httpcon.getResponseCode();
		
		if(rescode>=400) {
			System.out.println(url +"-->is broken link");
			
		}
		else {
			System.out.println(url + "---> is valid link");
			
		}
		
	}
	driver.close();

}
}
