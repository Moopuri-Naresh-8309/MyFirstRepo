package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=13342578970797239661&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		//entering text into search
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i7 Laptops");
		//clicking on search bar
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//Clicking on customer service
		driver.findElement(By.xpath("//a[contains(text(),'Customer')]")).click();
		//clicking on amazon logo
		driver.findElement(By.xpath("//a[contains(@id,'nav-logo-sprites')]")).click();
		//clicking on hamserberg(menu) symbol  
		driver.findElement(By.xpath("//i[contains(@class,'hm-icon nav-sprite')]")).click();
		//selecting mobiles and computers from given list
		driver.findElement(By.xpath("//div[contains(text(),'Mobiles, Computers')]")).click();
		
	}

}
