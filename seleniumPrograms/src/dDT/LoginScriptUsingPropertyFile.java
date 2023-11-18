package dDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptUsingPropertyFile {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		
		FileInputStream fiStream=new FileInputStream("./testdata/Data.properties");
		Properties property=new Properties();
		property.load(fiStream);
		driver.get(property.getProperty("url"));
		driver.findElement(By.linkText("Log in")).click();

		driver.findElement(By.id("Email")).sendKeys(property.getProperty("username"));
		driver.findElement(By.id("Password")).sendKeys(property.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
