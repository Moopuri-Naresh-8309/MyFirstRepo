package testNGEcecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_04 {
	@Test (groups = "system")
	public void navigatingToMyntra() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com");
		//intensionally want to fail the testy case then
		//assertTrue(false);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
