package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfRadiobuttons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://demoapps.qspiders.com/radio");
		List<WebElement> allRadioButtons = driver.findElements(By.xpath("//*[@type='radio']"));
		System.out.println(allRadioButtons.size());

		for (WebElement webElement1 : allRadioButtons) {
			webElement1.click();
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
}
