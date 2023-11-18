package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickClearSendKeysMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement ele1=driver.findElement(By.id("small-searchterms"));
		
		ele1.sendKeys("T-shirts");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Search']")).submit();
		
		driver.findElement(By.id("As")).click();
		
		//relative xpath 
		driver.findElement(By.xpath("//input[@class='button-1 search-button']")).submit();
		
		// absolute xpath
		driver.findElement(By.xpath("//body/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]/form[1]/div[3]/input[1]")).submit();
		 
		
		
	}

}
