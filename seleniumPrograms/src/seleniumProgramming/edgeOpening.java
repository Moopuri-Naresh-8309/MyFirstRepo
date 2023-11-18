package seleniumProgramming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeOpening
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "./selenium-drivers/msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.live.com/");
		driver.findElement(By.name("loginfmt")).sendKeys("moopurinaresh2001@outlook.com");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.name("passwd")).sendKeys("Naresh*9440");
		driver.findElement(By.id("idSIButton9")).click();
		driver.findElement(By.id("idSIButton9")).click();
		
		driver.navigate().to("https://www.google.co.in");
	}

}
