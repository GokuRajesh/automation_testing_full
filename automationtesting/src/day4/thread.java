package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("abc");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("jiko");
		Thread.sleep(2000);
		driver.quit();
	}

}
