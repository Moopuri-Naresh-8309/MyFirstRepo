package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	
	for(int i=0;i<100;i++) {
	try {
		driver.findElement(By.name("password")).sendKeys("1234565432");
		//System.out.println(i);
		break;
	} catch (Exception e) {
		System.out.println(i);
	}
	}
	
	
}
}
