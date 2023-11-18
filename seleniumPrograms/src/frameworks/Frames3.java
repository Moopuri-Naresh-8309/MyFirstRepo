package frameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tripodeal.com/hotels");
		
		driver.switchTo().frame("tpcwl_iframe");
		WebDriverWait wait =new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hotels-destination-whitelabel_en")));
		driver.findElement(By.id("hotels-destination-whitelabel_en")) .sendKeys("hyderabad",Keys.ENTER);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.partialLinkText("Goa")).click();
	}

}
