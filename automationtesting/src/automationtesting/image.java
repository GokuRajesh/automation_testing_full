package automationtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class image {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://petstore.octoperf.com");
		driver.findElement(By.linkText("Enter the Store")).click();
		WebElement fish=driver.findElement(By.xpath("//img[@src=\"../images/fish_icon.gif\"]"));
		fish.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
