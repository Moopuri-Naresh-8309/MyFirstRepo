package popups;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingMultipleWindowsHYR {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions(); 
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentWindowID = driver.getWindowHandle();
		driver.manage().window().fullscreen();
		
		WebElement element1 = driver.findElement(By.id("newWindowsBtn"));
		
		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
		 jsExecutor.executeScript("arguments[0].click();", element1);
		
		Set<String> allWindowIDS = driver.getWindowHandles();
		//removing parent in in all IDS
		allWindowIDS.remove(parentWindowID);
	
		String expectedTitle ="Basic Controls";
		
		for (String ID : allWindowIDS) {
			driver.switchTo().window(ID);
			if (driver.getTitle().contains(expectedTitle)) {
				System.out.println("if block");
				driver.manage().window().maximize();
				break;	
			}
			else {
				System.out.println("else block");
				driver.close();
			}
		}
		System.out.println(driver.getTitle());
		driver.findElement(By.id("firstName")).sendKeys("deepanaresh@gmail.com");
		driver.findElement(By.id("lastName")).sendKeys("Naresh1234");
	}
}
