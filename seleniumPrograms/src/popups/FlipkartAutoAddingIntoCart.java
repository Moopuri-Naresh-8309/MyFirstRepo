package popups;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlipkartAutoAddingIntoCart {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions(); 
		options.addArguments("--incognito");
		options.addArguments("start-maximized");

		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobiles", Keys.ENTER);
		String mainWindowID = driver.getWindowHandle();

		WebElement element1 = driver.findElement(By.xpath("//div[normalize-space()='POCO X5 Pro 5G (Astral Black, 128 GB)']"));
		driver.findElement(By.xpath("//div[normalize-space()='POCO X5 Pro 5G (Yellow, 256 GB)']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		for (int i = 1; i>=3;i++) {



		}
	}
}
