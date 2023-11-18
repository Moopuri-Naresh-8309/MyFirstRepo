package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HiddenDivisionPopupAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./selenium-drivers/geckodriver.exe");
		FirefoxOptions opt=new FirefoxOptions(); 
		opt.addArguments("--incognito");
		opt.addArguments("start-maximized");
		
		WebDriver driver=new FirefoxDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[contains(text(),'Popups')]")).click();	
		driver.findElement(By.xpath("//section[contains(text(),'Javascript')]")).click();
		driver.findElement(By.linkText("With checkbox")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Open alert')]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'×')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'close')]")).click();
		
		System.out.println("all statements executed succesfully");
		driver.quit();
	}
}
