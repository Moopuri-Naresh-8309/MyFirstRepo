package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageUsingPOMPage {
	
	public RegisterPageUsingPOMPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerElement;

	public WebElement getRegisterElement() {
		return registerElement;
	}
	@FindBy(id="gender-male")
	private WebElement genderElement;
	
	
	@FindBy(id="FirstName")
	private WebElement firstNamElement;
	
	@FindBy(id="LastName")
	private WebElement lastNamElement;
	
	@FindBy(id="Email")
	private WebElement emaiElement;

	public WebElement getGenderElement() {
		return genderElement;
	}

	public WebElement getFirstNamElement() {
		return firstNamElement;
	}

	public WebElement getLastNamElement() {
		return lastNamElement;
	}

	public WebElement getEmaiElement() {
		return emaiElement;
	}
	
	
}
