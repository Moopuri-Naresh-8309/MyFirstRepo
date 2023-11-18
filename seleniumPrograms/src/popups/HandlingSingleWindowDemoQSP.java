package popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingSingleWindowDemoQSP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions(); 
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		driver.findElement(By.xpath("//a[text()='New Window']")).click();
		String parentWindowID = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Open in new window")).click();
		Set<String> allWindowIDS = driver.getWindowHandles();
		//removing parent in in all IDS
		allWindowIDS.remove(parentWindowID);
		String expectedTitle = "new Window";//new window
		
		for (String ID : allWindowIDS) {
			driver.switchTo().window(ID);
			if (driver.getTitle().equals(expectedTitle)) {
				System.out.println("if block");
				break;	
			}
			else {
				System.out.println("else block");
			}
		}
		System.out.println("after for loop");
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("deepanaresh@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Naresh1234");
	}
}
