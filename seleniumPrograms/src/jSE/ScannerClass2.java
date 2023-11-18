package jSE;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScannerClass2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter the Username");

		String s=scan.next();

		System.out.println("Enter the password");
		String s1=scan.next();

		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait (10, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/fiction");

		driver.findElement(By.linkText ("Log in")).click();

		JavascriptExecutor jse= (JavascriptExecutor) driver;

		WebElement Email = driver.findElement(By.id("Email"));

		WebElement Password = driver.findElement(By.id("Password"));

		WebElement LoginButton = driver.findElement(By.xpath("//input[@value='Log in']"));

		jse.executeScript ("arguments[0].value="+s+"'",Email);

		//Thread.sleep(2000);

		jse.executeScript ("arguments[0].value="+s1+"'",Password);

		//Thread.sleep(2000);

		jse.executeScript ("arguments(0).click()",LoginButton);

	}

}
