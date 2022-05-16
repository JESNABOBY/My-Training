package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTCAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumBasics\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.keralartc.com/main.html");
		driver.manage().window().maximize();
		  String url;
		  String title;
		  title=driver.getTitle();
		  url=driver.getCurrentUrl();
		  System.out.print(title);
		  System.out.print(url);
	}

}
