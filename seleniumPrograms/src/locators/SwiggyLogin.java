package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyLogin
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
	/*	driver.findElement(By.linkText("Sign up")).click();
		driver.findElement(By.name("mobile")).sendKeys("8309149451");
		driver.findElement(By.name("name")).sendKeys("Naresh");
		driver.findElement(By.name("email")).sendKeys("deepanaresh@gmail.com");
		driver.findElement(By.linkText("CONTINUE")).click();
	*/
		driver.findElement(By.linkText("Login")).click();
		
	}

}
