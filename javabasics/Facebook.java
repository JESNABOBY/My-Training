package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumBasics\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.xpath("//input[@name='email']"));
		userName.sendKeys("aimee.boby@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("jesnaboby");
		WebElement searchFb=driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		searchFb.click();
		WebElement forgotPassword=driver.findElement(By.xpath("Forgotten password?"));
		linkedText.click();
	}

}
	