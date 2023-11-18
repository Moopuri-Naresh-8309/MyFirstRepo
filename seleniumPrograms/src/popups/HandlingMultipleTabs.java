
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

public class HandlingMultipleTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./selenium-drivers/geckodriver.exe");
		FirefoxOptions options=new FirefoxOptions();
		//options.addArguments("--incognito");
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new FirefoxDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 	driver.get("https://www.hyrtutorials.com/");
		Actions actionvar=new Actions(driver);
		actionvar.moveToElement(driver.findElement(By.linkText("Selenium Practice"))).perform();
		driver.findElement(By.linkText("Window Handles")).click();
		//driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWindowID = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[contains(text(),'Open New Tab')]")).click();
		Set<String> allWindowIDS = driver.getWindowHandles();
		//removing parent in in all IDS
		allWindowIDS.remove(parentWindowID);
		String expectedTitle = "AlertsDemo";
		
		for (String ID : allWindowIDS) {
			driver.switchTo().window(ID);
			if (expectedTitle.contains(driver.getTitle())) {
				System.out.println("if block");
				break;	
			}
			else {
				System.out.println("else block");
			}
		}		
	}
}
