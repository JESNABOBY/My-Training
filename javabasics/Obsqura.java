package javabasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Obsqura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.classplusapp.com/newApp/batches");
		driver.manage().window().maximize();
		String path=System.getProperty("user.dir");
		System.out.println(path);
		String url;
		String title;
		title=driver.getTitle();
		url=driver.getCurrentUrl();
		System.out.print(title);
		System.out.print(url);
	}

}
