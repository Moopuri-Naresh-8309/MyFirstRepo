package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/moopu/OneDrive/Desktop/Design.html");
		
		driver.findElement(By.id("username")).sendKeys("deepanareshmoopuri@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Naresh*9440");
		driver.findElement(By.name("confirmpassword")).sendKeys("Naresh*9440");
		
		driver.findElement(By.name("login")).click();
		
				
	}

}
