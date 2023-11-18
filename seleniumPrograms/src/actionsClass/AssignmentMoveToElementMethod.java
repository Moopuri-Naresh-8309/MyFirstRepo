package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentMoveToElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		Actions actionvar=new Actions(driver);
		
		actionvar.moveToElement(driver.findElement(By.linkText("Tutorials"))).perform();
		
		WebElement element1=driver.findElement(By.linkText("YouTube Courses"));
		actionvar.moveToElement(element1).perform();
		actionvar.moveToElement(driver.findElement(By.linkText("Selenium Practice"))).perform();
		
		driver.navigate().to("https://www.amazon.in/");
		actionvar.moveToElement(driver.findElement(By.linkText("Today's Deals"))).perform();
		actionvar.moveToElement(driver.findElement(By.linkText("Mobiles"))).perform();
		actionvar.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).perform();
		
		driver.navigate().to("https://www.hp.com/in-en/home.html");
		actionvar.moveToElement(driver.findElement(By.xpath("//span[text()='Explore']"))).perform();
		actionvar.moveToElement(driver.findElement(By.xpath("(//span[text()='Shop'])[1]"))).perform();
		actionvar.moveToElement(driver.findElement(By.xpath("(//span[text()='Support'])[1]"))).perform();
		
		
	}

}
