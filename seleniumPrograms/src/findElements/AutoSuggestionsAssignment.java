package findElements;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsAssignment {

	public static void main(String[] args) {
		
		Scanner searchScanner=new Scanner(System.in);
		System.out.println("Enter the item you are search for ");
		String searchString=searchScanner.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchString);
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[contains(text(),'"+searchString+"')]"));
		for (WebElement webElement1: suggestion) {
			System.out.println(webElement1.getText());	
		}
		driver.quit();
		
	}

}
