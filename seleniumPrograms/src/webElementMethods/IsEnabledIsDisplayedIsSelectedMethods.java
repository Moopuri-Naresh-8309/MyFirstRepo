package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledIsDisplayedIsSelectedMethods
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("login enabled or not "+element.isEnabled());
		System.out.println("logindisplayed  "+element.isDisplayed());
		driver.findElement(By.name("username")).sendKeys("deepanareshmoopuri");
		driver.findElement(By.name("password")).sendKeys("1234567890987");
		System.out.println("login enabled or not "+element.isEnabled());
		
		System.out.println("navigating to demowebshop register page ");
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		element=driver.findElement(By.xpath("//input[@id='gender-male']"));
		
		System.out.println("male gender status "+element.isSelected());
		element.click();
		System.out.println("male gender status "+element.isSelected());
		

	}

}
