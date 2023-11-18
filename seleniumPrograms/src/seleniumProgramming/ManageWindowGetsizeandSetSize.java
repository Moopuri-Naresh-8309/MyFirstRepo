package seleniumProgramming;

import java.awt.Window;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowGetsizeandSetSize 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println("height =="+driver.manage().window().getSize().height);
		System.out.println("width  =="+driver.manage().window().getSize().width);
		
		
		System.out.println("after changing dimensions");
		Dimension d=new Dimension(500, 400);
		
		driver.manage().window().setSize(d);
		
		System.out.println("height =="+driver.manage().window().getSize().height);
		System.out.println("width  =="+driver.manage().window().getSize().width);
		
	}

}
