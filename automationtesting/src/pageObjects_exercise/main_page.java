package pageObjects_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class main_page {
	WebDriver driver;
	public main_page(WebDriver driver) {
		this.driver=driver;
	}
	public void clickFish() {
		WebElement fish=driver.findElement(By.xpath("//area[@alt='Fish']"));
		fish.click();
	}
}
