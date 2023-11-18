package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndSendKeysAndDoubleClicliMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])[1]"));
		Actions actvarActions=new Actions(driver);
		actvarActions.moveToElement(element).perform();
		actvarActions.click().perform();
		actvarActions.sendKeys("Naresh").perform();
		
		driver.navigate().to("https://demowebshop.tricentis.com/");
		actvarActions.moveToElement(driver.findElement(By.linkText("Log in"))).click().perform();
		actvarActions.moveToElement(driver.findElement(By.id("Email"))).click().sendKeys("Naresh").perform();
		actvarActions.moveToElement(driver.findElement(By.id("Password"))).click().sendKeys("naresh").perform();
		
		WebElement element1 = driver.findElement(By.xpath("//input[@value='Log in']"));
		actvarActions.moveToElement(element1).click().perform();
		
		driver.navigate().to("https://demoapps.qspiders.com/button/buttonDoubleClick");
		WebElement element2 = driver.findElement(By.xpath("//p[contains(text(),'1. Are you satisfied with the registration process')]/..//button[1]"));
		actvarActions.moveToElement(element2).doubleClick().contextClick().perform();
		
		
		
		
		
	
	}

}
