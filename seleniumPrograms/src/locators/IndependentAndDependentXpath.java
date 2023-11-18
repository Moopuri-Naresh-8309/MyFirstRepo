package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentAndDependentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'KEYSJEFF Compatible with Fitbit Charge 5 Straps So')]/../../..//input[@type='submit']")).click();
		
	}

}
