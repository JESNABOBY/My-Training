package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Drivers\\Chromedriver\\chromedriver.exe");
	// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchField=driver.findElement(By.id("twotabsearchtextbox"));
		searchField.sendKeys("biscuit");
		WebElement searchButton=driver.findElement(By.cssSelector("//div[@class='_3wFoIb row']//input[@class='_2IX_2- VJZDxU']"));
		searchButton.click();
		//WebElement flipkartEmailField=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	}

}
