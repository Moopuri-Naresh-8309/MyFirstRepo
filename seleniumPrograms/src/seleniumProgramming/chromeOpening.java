package seleniumProgramming;
import org.openqa.selenium.chrome.ChromeDriver;
class chromeOpening
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./selenium-drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	}
}
