package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/alert/confirm");
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]")).click();
		Alert alertElement=driver.switchTo().alert();
		Thread.sleep(3000);
		
		System.out.println(alertElement.getText());
		//alertElement.accept();
		alertElement.dismiss();
		WebElement selectedoption = driver.findElement(By.xpath("//p[contains(text(),'You selected')]"));
		System.out.println(selectedoption.getText());
		}	
}
