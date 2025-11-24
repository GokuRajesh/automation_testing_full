package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

	WebDriver driver;
	
	@FindBy(linkText = "Register")
	WebElement register;

	@FindBy(linkText = "Log in")
	WebElement login;
	
	public homePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this); // Initialize the elements
	}
	
	public void clickRegister() {
		register.click();
	}
	
	public void clickLogin() {
		login.click();
	}
	
	

}
