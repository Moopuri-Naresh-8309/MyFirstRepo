package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText = "Log in")
	private WebElement loginLinkElement;
	
	@FindBy(id = "Email")
	private WebElement emailElement;
	
	@FindBy(id = "Password")
	private WebElement passwordElement;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButtonElement;

	public WebElement getLoginLinkElement() {
		return loginLinkElement;
	}

	public WebElement getEmailElement() {
		return emailElement;
	}

	public WebElement getPasswordElement() {
		return passwordElement;
	}

	public WebElement getLoginButtonElement() {
		return loginButtonElement;
	}
	
	
}
