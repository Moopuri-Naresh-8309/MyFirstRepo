package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submitMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele1=driver.findElement(By.id("small-searchterms"));
		
		ele1.sendKeys("T-shirts");
		Thread.sleep(1000);
		
		ele1.clear();
		Thread.sleep(1000);
		
		ele1.sendKeys("pants",Keys.ENTER);
		Thread.sleep(1000);
		
		 
		
		
	}

}
