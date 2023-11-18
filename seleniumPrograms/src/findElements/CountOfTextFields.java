package findElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountOfTextFields {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//*[@type='text']"));
		System.out.println(allCheckboxes.size());

		for (WebElement webElement : allCheckboxes) {
			System.out.println(webElement.getAttribute("textfield"));
		}

		driver.quit();
	}
}
