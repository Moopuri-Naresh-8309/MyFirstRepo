package seleniumProgramming;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxOpening
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./selenium-drivers/geckodriver.exe");
		FirefoxDriver FFopening=new FirefoxDriver();
	}
}
