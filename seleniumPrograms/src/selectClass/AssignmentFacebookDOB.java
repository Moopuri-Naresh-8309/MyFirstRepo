package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebookDOB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/reg/");
		
		Select daySelect = new Select(driver.findElement(By.id("day")));
		daySelect.selectByVisibleText("15");
		Select monthSelect = new Select(driver.findElement(By.id("month")));
		monthSelect.selectByVisibleText("Mar");
		Select yearSelect = new Select(driver.findElement(By.id("year")));
		yearSelect.selectByVisibleText("2001");
	}

}
