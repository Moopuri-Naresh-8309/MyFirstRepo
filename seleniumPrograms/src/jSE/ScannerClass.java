package jSE;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.dynamic.loading.ClassInjector.UsingInstrumentation;

public class ScannerClass {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter email id");
		String scanneremail=scan.next();
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter password");
		String scannerpassword=scan1.next();
		
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		
		
		WebElement emailElement=driver.findElement(By.id("Email"));
		WebElement passwordElement=driver.findElement(By.id("Password"));
		WebElement loginElement=driver.findElement(By.xpath("//input[@value='Log in']"));
		
		jsExecutor.executeScript("arguments[0].value='"+scanneremail+"'",emailElement);
		Thread.sleep(2000);
		jsExecutor.executeScript("arguments[0].value='"+scannerpassword+"'",passwordElement);
		Thread.sleep(2000);
		jsExecutor.executeScript("arguments[0].click()",loginElement);
		
		
		//without javaScript executor
		//driver.findElement(By.id("Email")).sendKeys(scanneremail);
		//driver.findElement(By.id("Password")).sendKeys(scannerpassword);
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
