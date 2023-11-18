package findElements;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the data into textfield");
		String data=scan.nextLine();
		driver.findElement(By.name("q")).sendKeys(data);
		List<WebElement> suggestion = driver.findElements(By.xpath("//span[contains(text(),'"+data+"')]"));
		for (WebElement webElement1: suggestion) {
			System.out.println(webElement1.getText());	
		}
		driver.quit();

	}
}
