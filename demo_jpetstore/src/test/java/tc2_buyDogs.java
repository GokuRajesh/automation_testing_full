import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc2_buyDogs {
	WebDriver driver;
	  @Test
	  public void f() throws InterruptedException {
		  driver.get("https://petstore.octoperf.com/");
		  driver.findElement(By.linkText("Enter the Store")).click();
		  System.out.println("Test started");
		  System.out.println("Test dog is under execution");
		  driver.findElement(By.xpath("//area[@alt='Dogs']")).click();
		  driver.findElement(By.linkText("K9-BD-01")).click();
		  driver.findElement(By.linkText("Add to Cart")).click();
		  WebElement quantity=driver.findElement(By.name("EST-6"));
		  quantity.clear();
		  quantity.sendKeys("10");
		  Thread.sleep(4000);
		  assertEquals(quantity.getAttribute("value"),"10");
	  }
	  @BeforeTest
	  public void beforetest() {
		  driver=new EdgeDriver();
		  System.out.println("Browser launched...");
	  }
	  @AfterTest
	  public void aftertest() {
		  driver.quit();
		  System.out.println("test ended");
	  }
}
