package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KSRTC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumBasics\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.keralartc.com/main.html");
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.amazon.in/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		WebElement text1=driver.findElement(By.xpath("//li[@class='nav-item']//a[@href=\"https://online.keralartc.com\"]"));
		text1.click();
		  String url;
		  String title;
		  title=driver.getTitle();
		  url=driver.getCurrentUrl();
		  System.out.print(title);
		  System.out.print(url);

		/*WebElement text2=driver.findElement(By.xpath("//li[@class='nav-item']//a[@href=\"https://citycircular.keralartc.com\"]"));
		text2.click();
		  String url;
		  String title;
		  title=driver.getTitle();
		  url=driver.getCurrentUrl();
		  System.out.print(title);
		  System.out.print(url);
		WebElement text3=driver.findElement(By.xpath("//li[@class='nav-item']//a[@href=\"https://www.keralartc.com/notification.html\"]"));
		text3.click();
		  String url;
		  String title;
		  title=driver.getTitle();
		  url=driver.getCurrentUrl();
		  System.out.print(title);
		  System.out.print(url);
		
		  String url;
		  String title;
		  title=driver.getTitle();
		  url=driver.getCurrentUrl();
		  System.out.print(title);
		  System.out.print(url);
		  System.out.println("title:" + driver.getTitle());
			driver.close();
			*/
	}

}
