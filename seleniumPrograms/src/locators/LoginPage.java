package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.id("Email")).sendKeys("deepanareshmoopuri@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Naresh*9440");
		driver.findElement(By.className("login-button")).click();
		driver.findElement(By.partialLinkText("Register")).click();
		

	}

}
