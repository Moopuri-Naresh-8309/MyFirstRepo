package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetCssValue
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement loginElement=driver.findElement(By.linkText("Log in"));
		System.out.println(loginElement.getText());
		System.out.println(loginElement.getCssValue("padding-bottom"));
		
		
		WebElement appearlElement=driver.findElement(By.linkText("Apparel & Shoes"));
		System.out.println(appearlElement.getText());
		System.out.println(appearlElement.getCssValue("color"));

	}

}
