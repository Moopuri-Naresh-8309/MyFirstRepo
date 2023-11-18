package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagnameAndGetAttribute 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?r=101");
		WebElement element=driver.findElement(By.name("firstname"));
		System.out.println(element.getTagName());
		System.out.println(element.getAttribute("id"));
		System.out.println(element.getAttribute("class"));
		
		System.err.println("*************************************");
		
		System.out.println(element.getAttribute("value"));
		
		System.err.println("**************************");
		
		element.sendKeys("naresh123");
		
		System.out.println(element.getAttribute("value"));
		
		System.err.println("**************************");
		
		System.out.println(driver.findElement(By.linkText("Already have an account?")).getAttribute("href"));
	
		
	
		
		
		
	}

}
