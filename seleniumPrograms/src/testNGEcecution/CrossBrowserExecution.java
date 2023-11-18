package testNGEcecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserExecution {
	@Test
	@Parameters("browser")
	public void demo(String browser) {

		if (browser.equals("chrome")) {
			System.out.println("Chrome is successfully launched");
			System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.quit();
			} else {
			System.out.println("edge is successfully launched");
			System.setProperty("webdriver.edge.driver", "./testdata/msedgedriver.exe");
			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.instagram.com");
			driver.quit();
		}
	}
}
