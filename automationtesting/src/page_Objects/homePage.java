package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

	WebDriver driver;
	WebElement register,login;
	public homePage(WebDriver driver){
		this.driver=driver;
	}
	public void clickRegister() {
		register=driver.findElement(By.linkText("Register"));
		register.click();
	}
	public void clickLogin() {
		login=driver.findElement(By.linkText("Log in"));
		login.click();
	}

}
