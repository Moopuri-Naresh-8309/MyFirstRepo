package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector3
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.cssSelector("input[name^='session']")).sendKeys("deepanareshmoopuri@gmail.com");
		driver.findElement(By.cssSelector("input#session_password")).sendKeys("Naresh*9440");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		

	}

}
