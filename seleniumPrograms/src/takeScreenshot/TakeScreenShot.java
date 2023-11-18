package takeScreenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tS=(TakesScreenshot) driver;
		
		Thread.sleep(2000);
		File photoFile =tS.getScreenshotAs(OutputType.FILE);
		File file=new File("./screenshots/facebook.png");
		photoFile.renameTo(file);
	
	}

}
