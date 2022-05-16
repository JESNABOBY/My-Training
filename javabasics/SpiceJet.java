package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumBasics\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement roundtrip=driver.findElement(By.xpath("//div[text()='round trip']"));
		roundtrip.click();
		WebElement deals=driver.findElement(By.xpath("/div[text()='Deals']"));
		deals.click();
		WebElement gift=driver.findElement(By.xpath("//div[contains(text(),'Gift')]"));
		gift.click();
		WebElement spiceClub=driver.findElement(By.xpath("//div[@class='css-1dbjc4n']//div[contains(text(),'SpiceClub')]"));
		spiceClub.click();
		WebElement cargo=driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8']//div[(text()='cargo)]"));
		cargo.click();
		
	}

}
