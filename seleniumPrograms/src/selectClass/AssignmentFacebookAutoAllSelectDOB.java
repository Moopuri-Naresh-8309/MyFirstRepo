package selectClass;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebookAutoAllSelectDOB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/reg/");
		
		Select daySelect = new Select(driver.findElement(By.id("day")));
		List<WebElement> dayalloptions = daySelect.getOptions();
		 for (WebElement webElement : dayalloptions) {
			webElement.click();
		}
		
		Select monthSelect = new Select(driver.findElement(By.id("month")));
		List<WebElement> monthalloptions = monthSelect.getOptions();
		 for (WebElement webElement : monthalloptions) {
			webElement.click();
		}
		
		Select yearSelect = new Select(driver.findElement(By.id("year")));
		List<WebElement> yearalloptions = yearSelect.getOptions();
		 for (WebElement webElement : yearalloptions) {
			webElement.click();
		}		 
	}
}
