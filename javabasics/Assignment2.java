package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Drivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		WebElement bullet1=driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		bullet1.click();
		WebElement bullet2=driver.findElement(By.xpath("//input[@id='vfb-7-2']"));
		bullet2.click();
		WebElement bullet3=driver.findElement(By.xpath("//input[@id='vfb-7-3']"));
		bullet3.click();
		WebElement checkBox1=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
		checkBox1.click();
		WebElement checkBox2=driver.findElement(By.xpath("//input[@id='vfb-6-1']"));
		checkBox2.click();
		WebElement checkBox3=driver.findElement(By.xpath("//input[@id='vfb-6-2']"));
		checkBox3.click();
		
	}
}
