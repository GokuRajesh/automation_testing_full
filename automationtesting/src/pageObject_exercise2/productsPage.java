package pageObject_exercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsPage {
	WebDriver driver;
	
	public productsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void verifyItemExists(String s) {
		try {
		if(driver.findElement(By.linkText(s)).isDisplayed()) {
			System.out.println("product exists");
		}
		}
		catch(Exception e)
		{
			System.out.println("product doesn't exists");
		}
	}
	public void addtoCart(String s) {
		driver.findElement(By.linkText(s)).click();
		driver.findElement(By.id("add-to-cart")).click();
		driver.findElement(By.id("back-to-products")).click();
	}
}
