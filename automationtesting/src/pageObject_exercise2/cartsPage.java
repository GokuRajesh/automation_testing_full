package pageObject_exercise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartsPage {
WebDriver driver;
	
	@FindBy(className ="shopping_cart_link")
	WebElement cart;
	
	@FindBy(id= "checkout")
	WebElement checkout;
	
	@FindBy(id= "first-name")
	WebElement firstName;
	
	@FindBy(id= "last-name")
	WebElement lastName;
	
	@FindBy(id= "postal-code")
	WebElement zip;
	
	
	public cartsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickCheckout() {
		cart.click();
		checkout.click();
	}
	public void enterFirstName(String s) {
		firstName.sendKeys(s);
	}
	public void enterLastNamse(String s) {
		lastName.sendKeys(s);
	}
	public void enterZip(String s) {
		zip.sendKeys(s);
	}
}
