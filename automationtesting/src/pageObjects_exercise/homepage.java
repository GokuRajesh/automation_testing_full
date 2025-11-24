package pageObjects_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	WebDriver driver;
	public homepage(WebDriver driver){
		this.driver=driver;
	}
	public void clickEnterTheStore() {
		WebElement my=driver.findElement(By.linkText("Enter the Store"));
		my.click();
	}
	public void clickRegister() {
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
	}
	public void clickLogin() {
		WebElement login=driver.findElement(By.linkText("Login"));
		login.click();
	}
}
