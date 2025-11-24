package day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class impicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
	
		driver.findElement(By.id("FirstName")).sendKeys("abc");
	
		driver.findElement(By.id("LastName")).sendKeys("jiko");

		driver.quit();
	}

}
