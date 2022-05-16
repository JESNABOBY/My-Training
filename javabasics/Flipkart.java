package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Drivers\\Chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.get("https://web.classplusapp.com/newApp/batches");
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			WebElement flipkartEmailField=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
			flipkartEmailField.sendKeys("jesna.john@gmail.com");
			WebElement forgotLink=driver.findElement(By.xpath("//span[text()='Forgot?']"));
			forgotLink.click();
			WebElement requestOtp=driver.findElement(By.xpath("//button[contains(@class,'_2HKlqd _3NgS1a')]"));
			requestOtp.click();
	}

}
