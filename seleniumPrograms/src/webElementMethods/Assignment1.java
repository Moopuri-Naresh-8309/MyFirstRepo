package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Flog-in%2Fs%3Fk%3Dlog%2Bin%26ref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.findElement(By.id("ap_email")).sendKeys("nareshhhhhhhhhhhh");
		Thread.sleep(1000);
		
		driver.findElement(By.id("ap_email")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.id("ap_email")).sendKeys("deepanareshmoopuri@gmail.com");
		
		driver.findElement(By.id("continue")).submit();
		
		driver.findElement(By.id("ap_password")).sendKeys("Naresh*9440");
		
		System.out.println(driver.findElement(By.linkText("Forgot Password")).getText());//forgot password
		System.out.println(driver.findElement(By.linkText("Forgot Password")).getTagName());//a
		
		System.out.println(driver.findElement(By.id("signInSubmit")).getAttribute("class"));//a-button-input
		
		System.out.println(driver.findElement(By.id("signInSubmit")).getCssValue("color"));//black
		System.out.println(driver.findElement(By.id("signInSubmit")).getLocation());
		System.out.println(driver.findElement(By.id("signInSubmit")).getSize());
		
		System.out.println(driver.findElement(By.xpath("//input[@name='rememberMe']")).isEnabled());
		
		System.out.println(driver.findElement(By.xpath("//input[@name='rememberMe']")).isDisplayed());
		
		driver.findElement(By.name("rememberMe")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='rememberMe']")).isSelected());
		driver.findElement(By.id("signInSubmit")).click();
		
		driver.quit();
		
		
	}

}
