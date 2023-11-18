package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/moopu/OneDrive/Desktop/Dropdown.html");
		
		 WebElement dropdown = driver.findElement(By.id("multiple"));
		 Select select=new Select(dropdown);
		 select.selectByValue("4");
		 Thread.sleep(2000);
		 select.selectByIndex(0);
		 Thread.sleep(2000);
		 select.selectByVisibleText("manual");
		 Thread.sleep(2000);
		 
		 List<WebElement> allselectedoptions = select.getAllSelectedOptions();
		 
		 for (WebElement webElement : allselectedoptions) {
			System.out.println(webElement.getText());
		}
		 
		
	}

}
