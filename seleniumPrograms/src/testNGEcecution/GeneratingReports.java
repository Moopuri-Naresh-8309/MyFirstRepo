package testNGEcecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GeneratingReports {
	@Test
	public void testcase() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("browser is launched", true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		Reporter.log("browser is maximized", true);
		
		driver.get("https://www.google.co.in");
		Reporter.log("browser is navigated to google", true);
		Thread.sleep(2000);
		driver.quit();
		Reporter.log("browser is closed", true);
	}
}
