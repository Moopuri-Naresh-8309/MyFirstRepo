package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationSizeRectMethods 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement element=driver.findElement(By.id("email"));
		
		System.out.println("The email text field X axis value is == "+element.getLocation().x);
		System.out.println("The email text field Y axis value is == "+element.getLocation().y);
		
		System.err.println("**************************");
		
		System.out.println("The email text field Height is == "+element.getSize().height);
		System.out.println("The email text field Width is == "+element.getSize().width);

		System.err.println("**************************");
		System.out.println("using GETRECT() method ");
		System.err.println("**************************");
		
		System.out.println("The email text field X axis value is == "+element.getRect().x);
		System.out.println("The email text field Y axis value is == "+element.getRect().y);
		
		System.out.println("The email text field Height is == "+element.getRect().height);
		System.out.println("The email text field Width is == "+element.getRect().width);
		
		

	}

}
