package seleniumProgramming;

import java.awt.Window;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindowSetPosition {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println("the x coordinate is  = "+ driver.manage().window().getPosition().x);
		System.out.println("the y coordinate is  = "+ driver.manage().window().getPosition().y);
		
		Point p=new Point(10, 400);
		
		driver.manage().window().setPosition(p);
		
		
	}

}
