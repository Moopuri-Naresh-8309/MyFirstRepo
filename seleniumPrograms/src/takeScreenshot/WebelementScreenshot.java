package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebelementScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		
		File file= driver.findElement(By.name("username")).getScreenshotAs(OutputType.FILE);
		
		String presentdatetimeString=LocalDateTime.now().toString().replace(':', '-');
		FileHandler.copy(file, new File("./screenshots/"+presentdatetimeString+".png"));
		
		//File destinationFile=new File("./screenshots/element.png");
		
		//even we can create the folder while giving the path only ("./webelementscreenshot/element.png");
		
		//FileUtils.copyFile(file, destinationFile);
		
		
	}

}
