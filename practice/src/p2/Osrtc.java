package p2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Osrtc {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/Users/priyabratahota/Downloads/chromedriver");
		WebDriver wd= new ChromeDriver();
		
		wd.get("https://www.redbus.in/");
		
//		wd.findElement(By.xpath("//a[@class='ebookingtextA'][0]")).click();
		
		Thread.sleep(6500);
		wd.quit();

	}
}
