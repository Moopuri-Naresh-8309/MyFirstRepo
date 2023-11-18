package frameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IframesScrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.get("https://www.hyrtutorials.com/");
		//Select seldropdown = new Select(driver.findElement(By.linkText("Selenium Practice")));
		//seldropdown.selectByVisibleText("Frames Practice");
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame("frm3");
		
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		
		jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
