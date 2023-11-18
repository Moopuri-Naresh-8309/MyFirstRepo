package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./selenium-drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/alert/prompt");
		driver.findElement(By.xpath("//button[contains(text(),'Prompt Alert Box')]")).click();
		Alert promptElement=driver.switchTo().alert();
		Thread.sleep(3000);
		
		System.out.println(promptElement.getText());
		
		promptElement.sendKeys("yes");
		Thread.sleep(3000);
		promptElement.accept();
	}	
}
