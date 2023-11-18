package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.cssSelector("input[id=\"Email\"]")).sendKeys("deepanareshmoopuri@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"Password\"]")).sendKeys("Naresh*9440");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		
		
		
		driver.get("https://in.linkedin.com/");
		//driver.findElement(By.cssSelector("input[autocomplete=\"username\"]")).sendKeys("deepanareshmoopuri@gmail.com");
		//driver.findElement(By.cssSelector("input[id=\"session_password\"]")).sendKeys("Naresh*9440");
		
		
		// advance search selection using CSS
		driver.findElement(By.cssSelector("input#session_key")).sendKeys("deepa");
		driver.findElement(By.cssSelector("input#session_password")).sendKeys("Naresh*9440");
		driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		
		
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.cssSelector("input[id$=\"ion_key\"]")).sendKeys("naresh");
	}
}
