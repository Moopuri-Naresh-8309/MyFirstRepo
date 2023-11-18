package webElementMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "./selenium-drivers/edgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.navigate().to("https://demowebshop.tricentis.com/register");
		driver.navigate().to("https://accounts.google.com/b/0/AddMailService");
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().to("https://www.google.com/maps");
		driver.navigate().to("https://translate.google.com/");
		driver.navigate().to("https://web.whatsapp.com/");
		driver.navigate().to("https://www.ulektz.com/start/signin");
		driver.navigate().to("https://online.qspiders.com/user");
		driver.navigate().to("https://www.nvsp.in/");
		driver.navigate().to("https://chat.openai.com/");
		driver.navigate().to("https://js.redirect.hp.com/jumpstation?bd=expressvpn&c=*&locale=en_us&pf=*&s=*&tp=edge");
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().to("https://www.bing.com/search?q=selenium+drivers+download&gs_lcrp=EgZjaHJvbWUqCQgBEEUYQBjCAzIJCAAQRRhAGMIDMgkIARBFGEAYwgMyCQgCEEUYQBjCAzIJCAMQRRhAGMIDMgkIBBBFGEAYwgMyCQgFEEUYQBjCAzIJCAYQRRhAGMIDMgkIBxBFGEAYwgPSAQg4ODc5ajBqNKgCCLACAQ&FORM=ANAB01&PC=HCTS");
		driver.navigate().to("https://www.bing.com/search?q=download+google+chrome+driver+for+selenium&gs_lcrp=EgZjaHJvbWUqBAgCEAAyBAgAEAAyBAgBEAAyBAgCEAAyBAgDEAAyCQgEEEUYQBjCAzIJCAUQRRhAGMIDMgkIBhBFGEAYwgMyCQgHEEUYQBjCA9IBCTEwMjE3ajBqOagCBLACAQ&FORM=ANAB01&PC=HCTS");
		driver.navigate().to("https://www.facebook.com");
		
		
	}

}
