package pageObjects_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fish {
	WebDriver driver;
	public Fish(WebDriver driver) {
		this.driver=driver;
	}
	public void clickAngelFish() {
		WebElement angel=driver.findElement(By.linkText("FI-SW-01"));
		angel.click();
	}
}
