package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethods 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//click method is used to click on webelement
		driver.findElement(By.linkText("Log in")).click();
		
		//sendkeys method is used to send/ enter data in it
		driver.findElement(By.id("Email")).sendKeys("deepanaresh");
		
		//clear method is used to clear the text which is already entered into textfield
		driver.findElement(By.id("Email")).clear();
		
		//getAttribute method is used to get the attribute value of an webelement
		driver.findElement(By.id("Email")).getAttribute("class");//Email
		
	}

}
