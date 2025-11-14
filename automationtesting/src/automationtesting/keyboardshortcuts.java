package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class keyboardshortcuts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com");
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		WebElement fname=driver.findElement(By.id("FirstName"));
		fname.sendKeys("raja");
		WebElement lname=driver.findElement(By.id("LastName"));
		fname.sendKeys(Keys.CONTROL,"a");
		fname.sendKeys(Keys.CONTROL,"c");
		lname.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
