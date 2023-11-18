package seleniumProgramming;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods 
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);

		driver.navigate().to("https://www.flipkart.com");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		URL url=new URL("https://google.com");
		driver.navigate().to(url);
		Thread.sleep(2000);

		URL url2=new URL("https://www.facebook.com");
		driver.navigate().to(url2);
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.quit();
	}

}
