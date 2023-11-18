package jSE;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/search?q=wikipedia&rlz=1C1ONGR_enIN1073IN1073&oq=wikipedia&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCDIzNjRqMGo0qAIAsAIA&sourceid=chrome&ie=UTF-8");
		//Thread.sleep(3000);
		JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
		
		jsExecutor.executeScript("scrollTo(0,1500)");
	}
}
