package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegister 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("moopuri");
		driver.findElement(By.id("LastName")).sendKeys("Naresh");
		driver.findElement(By.id("Email")).sendKeys("deepanareshmoopuri@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Naresh*9440");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Naresh*9440");
		driver.findElement(By.id("register-button")).click();
		// registration completed
		
		driver.findElement(By.className("register-continue-button")).click();
		

	}

}
