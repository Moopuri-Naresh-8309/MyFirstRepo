package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptionsAtATime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/moopu/OneDrive/Desktop/Dropdown.html");
		
		 WebElement dropdown = driver.findElement(By.id("multiple"));
		 Select select=new Select(dropdown);
		 
		 List<WebElement> alloptions = select.getOptions();
		 for (WebElement webElement : alloptions) {
			System.out.println(webElement.getText());
		}
	}
}
