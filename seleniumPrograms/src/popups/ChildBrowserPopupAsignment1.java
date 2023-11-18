package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChildBrowserPopupAsignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions(); 
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("disable-popup-blocking");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*
	 	driver.get("https://www.hyrtutorials.com/");
		Actions actionvar=new Actions(driver);
		actionvar.moveToElement(driver.findElement(By.linkText("Selenium Practice"))).perform();
		driver.findElement(By.linkText("Window Handles")).click();
		*/
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.id("newTabBtn")).click();		
	}
}
