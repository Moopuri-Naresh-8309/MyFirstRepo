package frameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		
		driver.findElement(By.id("name")).sendKeys("selenium");
		
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("frame3selenium");
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		jsExecutor.executeScript("scrollTo(0,1000)");
		
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("moopuri");
		
		

	}

}
