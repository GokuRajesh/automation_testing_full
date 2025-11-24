package pageObject_exercise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	
	@FindBy(id ="user-name")
	WebElement username;
	
	@FindBy(id= "password")
	WebElement password;
	
	@FindBy(id= "login-button")
	WebElement login;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername(String s) {
		username.sendKeys(s);
	}
	public void enterPassword(String s) {
		password.sendKeys(s);
	}
	public void clickLoginButton() {
		login.click();
	}
}
