package pOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		LoginPage page=new LoginPage(driver);
		page.getLoginLinkElement().click();
		page.getEmailElement().sendKeys("naresh");
		page.getPasswordElement().sendKeys("naresh");
		page.getLoginButtonElement().click();

	
	}
}
