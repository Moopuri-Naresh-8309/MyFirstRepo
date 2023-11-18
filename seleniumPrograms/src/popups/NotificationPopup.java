package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		
		//creating object for chromeoptions class
		ChromeOptions opt=new ChromeOptions(); 
		//to disable notifications
		opt.addArguments("--disable-notifications");
		//to open window in incognito mode
		opt.addArguments("--incognito");
		//to launch browser in maximized mode
		opt.addArguments("start-maximimized");
		//to open browser in headless mode
		opt.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
	}
}
