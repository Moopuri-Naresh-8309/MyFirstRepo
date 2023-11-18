package seleniumProgramming;

import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowMaximize 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");	
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.com");
	}

}
