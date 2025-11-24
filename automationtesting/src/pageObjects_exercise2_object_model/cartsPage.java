package pageObjects_exercise2_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartsPage {
	WebDriver driver;
	
	
	public cartsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickCheckout() {
		WebElement cart=driver.findElement(By.className("shopping_cart_link"));
		cart.click();
		WebElement checkout=driver.findElement(By.name("checkout"));
		checkout.click();
	}
	public void enterFirstName(String s) {
		WebElement firstName=driver.findElement(By.id("first-name"));
		firstName.sendKeys(s);
	}
	public void enterLastNamse(String s) {
		WebElement lastName=driver.findElement(By.id("last-name"));
		lastName.sendKeys(s);
	}
	public void enterZip(String s) {
		WebElement zip=driver.findElement(By.id("postal-code"));
		zip.sendKeys(s);
	}
}
