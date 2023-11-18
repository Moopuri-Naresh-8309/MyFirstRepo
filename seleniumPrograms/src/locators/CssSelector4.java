package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector4
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("deepanareshmoopuri@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("Naresh*9440");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}

}
