package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebookAutoDOB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/reg/");
		
		Select daySelect = new Select(driver.findElement(By.id("day")));
		List<WebElement> dayoptions = daySelect.getOptions();
		for (int i = 0; i < dayoptions.size(); i++) {
			if (i<=14) {
				daySelect.selectByIndex(i);
			}
			else {
				break;
			}
		}
		
		Select monthSelect = new Select(driver.findElement(By.id("month")));
		List<WebElement> monthoptions = monthSelect.getOptions();
		for (int i = 0; i < monthoptions.size(); i++) {
			if (i<=2) {
				monthSelect.selectByIndex(i);
			}
			else {
				break;
			}
		}
		
		Select yearSelect = new Select(driver.findElement(By.id("year")));
		List<WebElement> yearoptions = yearSelect.getOptions();
		for (int i = 0; i < yearoptions.size(); i++) {
			if (i<=22) {
				yearSelect.selectByIndex(i);
			}
			else {
				break;
			}
		}
		
		
	}

}
