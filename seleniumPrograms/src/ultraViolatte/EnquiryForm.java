package ultraViolatte;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EnquiryForm 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ultraviolette.com/");
		driver.findElement(By.linkText("Enquiry")).click();
		driver.findElement(By.name("contact[first_name]")).sendKeys("Moopuri naresh");
		driver.findElement(By.name("contact[mobile_number]")).sendKeys("8309149451");
		driver.findElement(By.name("contact[email]")).sendKeys("deepanareshmoopuri@gmail.com");
		Select drpState = new Select(driver.findElement(By.name("contact[custom_field][cf_pincode]")));
		drpState.selectByVisibleText("Karnataka");
	}

}
