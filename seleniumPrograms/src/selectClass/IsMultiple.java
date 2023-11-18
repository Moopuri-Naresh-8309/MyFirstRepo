package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/moopu/OneDrive/Desktop/Dropdown.html");
		
		Select select1=new Select(driver.findElement(By.id("single")));
		select1.selectByValue("2");
		Thread.sleep(2000);
		select1.selectByVisibleText("sql");
		Thread.sleep(2000);
		select1.selectByIndex(0);
		Thread.sleep(2000);
		
		Select select=new Select(driver.findElement(By.id("multiple")));
		select.selectByValue("2");
		Thread.sleep(2000);
		select.selectByVisibleText("sql");
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		
		//select.deselectAll();
		//Thread.sleep(2000);
		select.deselectByIndex(0);
		Thread.sleep(2000);
		select.deselectByValue("2");
		Thread.sleep(2000);
		select.deselectByVisibleText("sql");
		Thread.sleep(2000);
		
	}

}
