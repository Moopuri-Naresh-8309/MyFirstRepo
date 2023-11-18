package frameworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("naresh");
		
		//selecting the frame by using index value
		driver.switchTo().frame(1);
		Select courseseSelect=new Select(driver.findElement(By.id("course")));
		courseseSelect.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		//selecting the frame using id attribute
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("moopuri");
		driver.findElement(By.id("lastName")).sendKeys("Naresh");
		
		driver.switchTo().defaultContent();
		//selecting frame using element
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("frame3");
		
		//again going to frame inside another frame
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("moopuri");
		driver.findElement(By.id("lastName")).sendKeys("Naresh");
		
		//getting 1 frame back
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frm1");
		Select frame3frame1Menu=new Select(driver.findElement(By.id("selectnav1")));
		frame3frame1Menu.selectByVisibleText("-- Automation Testing");
		
		
		//returning driver control to home page
		
		driver.switchTo().defaultContent();
		driver.navigate().to("https://www.google.co.in");
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
