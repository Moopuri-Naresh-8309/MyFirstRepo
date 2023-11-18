package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/alert");
		driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
		//Alert alertElement=driver.switchTo().alert();
		//Thread.sleep(3000);
		//alertElement.accept();
		
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		//if we do dismiss() for alert then it will treat it as accept only
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("naresh");
	}
}
