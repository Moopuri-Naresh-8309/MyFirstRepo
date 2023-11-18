package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingFileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions(); 
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoapps.qspiders.com/fileUpload");
		driver.findElement(By.id("fileInput")).sendKeys("C:\\User\\moopu\\OneDrive\\Desktop\\Irctc id's.png\\");	

	}

}
