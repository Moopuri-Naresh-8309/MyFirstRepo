package seleniumProgramming;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowFullScreen 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().fullscreen();

	}

}
