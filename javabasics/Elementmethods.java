package javabasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SeleniumBasics\\BrowserDrivers\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement amazon=driver.findElement(By.xpath("//a[@href='/computers-and-accessories/b/?ie=UTF8&node=976392031&ref_=nav_cs_pc']"));
	WebElement amazon2=driver.findElement(By.xpath("//a[@id='nav-orders']//span[@class='nav-line-1']"));
	String string1;
	String string2;
	string1=amazon.getText();
	string2=amazon2.getText();
	System.out.println(string1);
	System.out.println(string2);
	}
*/
	driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");	
	driver.manage().window().maximize();
		/*WebElement input1=driver.findElement(By.xpath("//form//input[1]"));
		boolean a=input1.isDisplayed();
		System.out.println(a);
		WebElement input2=driver.findElement(By.xpath("//form//input[2]"));
		boolean b=input2.isDisplayed();
		System.out.println(b);
		System.out.println(input1.isDisplayed());
		System.out.println(input2.isDisplayed());
	}
}
		/*boolean a1=input1.isEnabled();
		System.out.println(a1);
		boolean b1=input2.isEnabled();
		System.out.print(b1);
		boolean s=input1.isSelected();
		boolean p=input2.isSelected();
		/*if (s==false)
		{
		input1.click();
		}
		if(p==false)
		{
			input2.click();
		}
		}
		
		
		if(!input1.isSelected())
		{
			input1.click();
		}
		if(!input2.isSelected())
		{
			input2.click();
		}
		}
		*/
		WebElement text1=driver.findElement(By.xpath("//div[@class='form-group']//input[@id='single-input-field']"));
		//text1.click();
		text1.sendKeys("5");
		WebElement message=driver.findElement(By.xpath("//button[@id='button-one']"));
		message.click();
    	System.out.print(message.getText());

	}
}
