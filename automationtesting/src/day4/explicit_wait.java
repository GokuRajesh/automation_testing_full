package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		
		driver.get("http://demowebshop.tricentis.com");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement register;
		register=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Register")));
		register.click();
	
		driver.findElement(By.id("FirstName")).sendKeys("abc");
	
		driver.findElement(By.id("LastName")).sendKeys("jiko");

	}

}
