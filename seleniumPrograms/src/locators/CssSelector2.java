package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("input[type='text'][name='Email']")).sendKeys("deepanareshmoopuri@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Naresh*9440");
		driver.findElement(By.cssSelector("input[class^='button-1'][type='submit'][value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
		
		driver.navigate().to("https://in.linkedin.com/");
		driver.findElement(By.cssSelector("input[id='session_key']")).sendKeys("deepanareshmoopuri@gmail.com");
		driver.findElement(By.cssSelector("input#session_password")).sendKeys("Naresh*9440");
		driver.findElement(By.cssSelector("button[type='submit'][data-id='sign-in-form__submit-btn']")).click();
		
		
	}

}
