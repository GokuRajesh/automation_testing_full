package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		boolean expValue=false, actValue;
		WebElement rememberme=driver.findElement(By.id("RememberMe"));
		rememberme.click();
		actValue=rememberme.isSelected();
		if (expValue==actValue) {
			System.out.println("Test is pass");
		}
		else {
			System.out.println("Test is fail");
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
