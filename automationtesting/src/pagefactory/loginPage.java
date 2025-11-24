package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(linkText = "Password")
	WebElement password;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String s) {
		username.sendKeys(s);
	}
	
	public void clickRegister(String s) {
		password.sendKeys(s);
	}
	
}
