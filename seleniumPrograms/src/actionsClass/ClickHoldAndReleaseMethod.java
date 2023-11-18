package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHoldAndReleaseMethod {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapps.qspiders.com/dragDrop");
		WebElement src1 = driver.findElement(By.xpath("//div[contains(text(),'Apple')]"));
		WebElement destination1 = driver.findElement(By.xpath("(//div[contains(@class,'h-8')])[1]"));
		
		Actions actions=new Actions(driver);
		actions.dragAndDrop(src1, destination1).perform();
		
		WebElement src2 = driver.findElement(By.xpath("//div[contains(text(),'Mango')]"));
		WebElement destination2 = driver.findElement(By.xpath("(//div[contains(@class,'h-8')])[2]"));
		//actions.dragAndDrop(src2, destination2).perform();
		actions.clickAndHold(src2).release(destination2).perform();
		
		WebElement src3 = driver.findElement(By.xpath("//div[contains(text(),'Banana')]"));
		WebElement destination3 = driver.findElement(By.xpath("(//div[contains(@class,'h-8')])[3]"));
		//actions.dragAndDrop(src3, destination3).perform();
		actions.clickAndHold(src3).release(destination3).perform();
		
		WebElement src4 = driver.findElement(By.xpath("//div[contains(text(),'Guava')]"));
		WebElement destination4 = driver.findElement(By.xpath("(//div[contains(@class,'h-8')])[4]"));
		//actions.dragAndDrop(src4, destination4).perform();
		actions.clickAndHold(src4).release(destination4).perform();
	}

}
