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
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChildBrowserPopupFlipkartAsignment {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions(); 
		options.addArguments("start-maximized");

		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("mobiles", Keys.ENTER);
		String mainWindowID = driver.getWindowHandle();

		//first product
		driver.findElement(By.xpath("//div[normalize-space()='POCO X5 Pro 5G (Astral Black, 128 GB)']")).click();
		Set<String> allWindowIDS = driver.getWindowHandles();
		String ExpectedTitle1 = "POCO X5 Pro 5G with Snapdragon 778G at Just ₹17,749*";
		for (String ID : allWindowIDS) {
			driver.switchTo().window(ID);
			if (ExpectedTitle1.equalsIgnoreCase(driver.getTitle())) {
				break;
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.switchTo().window(mainWindowID);

		//second product
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[normalize-space()='POCO X5 Pro 5G (Yellow, 256 GB)']")).click();
		Set<String> allWindowIDS2 = driver.getWindowHandles();
		String ExpectedTitle2 = "POCO X5 Pro 5G ( 256 GB Storage, 8 GB RAM ) Online at Best Price On Flipkart.com";
		for (String ID : allWindowIDS2) {
			driver.switchTo().window(ID);
			if (ExpectedTitle2.contains(driver.getTitle())) {
				break;
			}
		}
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.switchTo().window(mainWindowID);

		//third product
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[normalize-space()='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		Set<String> allWindowIDS3 = driver.getWindowHandles();
		String ExpectedTitle3 = "APPLE iPhone 14";
		for (String ID : allWindowIDS3) {
			driver.switchTo().window(ID);
			if (ExpectedTitle3.contains(driver.getTitle())) {
				break;
			}
		}
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.switchTo().window(mainWindowID);

		//fourth product
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[normalize-space()='APPLE iPhone 14 Plus (Midnight, 128 GB)']")).click();
		Set<String> allWindowIDS4 = driver.getWindowHandles();
		String ExpectedTitle4 = "APPLE iPhone 14 Plus ( 128 GB Storage ) Online at Best Price On Flipkart.com";
		for (String ID : allWindowIDS4) {
			driver.switchTo().window(ID);
			if (ExpectedTitle4.contains(driver.getTitle())) {
				break;
			}
		}
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.switchTo().window(mainWindowID);

		//fifth product
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[normalize-space()='realme C51 (Mint Green, 64 GB)']")).click();
		Set<String> allWindowIDS5 = driver.getWindowHandles();
		String ExpectedTitle5 = "Realme C51 Starting From Just ₹7,999";
		for (String ID : allWindowIDS5) {
			driver.switchTo().window(ID);
			if (ExpectedTitle5.contains(driver.getTitle())) {
				break;
			}
		}
		driver.navigate().refresh();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.switchTo().window(mainWindowID);
	}
}