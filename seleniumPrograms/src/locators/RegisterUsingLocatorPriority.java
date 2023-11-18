package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUsingLocatorPriority 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("moopuri");
		driver.findElement(By.id("LastName")).sendKeys("naresh");
		driver.findElement(By.id("Email")).sendKeys("deepanareshmoopuri@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Naresh*9440");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Naresh*9440");
		driver.findElement(By.id("register-button")).click();
		
		
		
		
	}

}
