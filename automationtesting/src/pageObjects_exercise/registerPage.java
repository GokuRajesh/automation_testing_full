package pageObjects_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registerPage {
	WebDriver driver;
	public registerPage(WebDriver driver) {
		this.driver=driver;
	}
	public void sendFirstname(String s) {
		WebElement name=driver.findElement(By.name("firstname"));
		name.click();
	}
	public void sendLastname(String s) {
		WebElement name=driver.findElement(By.name("lastname"));
		name.click();
	}
	public void sendEmail(String s) {
		WebElement email=driver.findElement(By.name("email"));
		email.click();
	}
	public void sendPassword(String s) {
		WebElement password=driver.findElement(By.name("password"));
		password.click();
	}
}
