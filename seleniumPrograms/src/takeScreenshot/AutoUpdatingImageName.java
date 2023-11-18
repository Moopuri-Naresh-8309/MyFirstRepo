package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class AutoUpdatingImageName {

	public static void main(String[] args) throws IOException {

	System.setProperty("webdriver.gecko.driver", "./selenium-drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://google.co.in/");
	
	TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
	File file=takesScreenshot.getScreenshotAs(OutputType.FILE);	
	
	String presentdatetimeString=LocalDateTime.now().toString().replace(':', '-');
	FileHandler.copy(file, new File("./screenshots/"+presentdatetimeString+".png"));
	
	
	}

}
