package exercise_reporter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class tc2_buyDog extends reporter {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  logger=extent.startTest("tc2_buydog");
	  driver.get("https://petstore.octoperf.com/");
	  driver.findElement(By.linkText("Enter the Store")).click();
	  System.out.println("Test started");
	  System.out.println("Test dog is under execution");
	  driver.findElement(By.xpath("//area[@alt='Dogs']")).click();
	  driver.findElement(By.linkText("K9-BD-01")).click();
	  driver.findElement(By.linkText("Add to Cart")).click();
	  WebElement quantity=driver.findElement(By.name("EST-6"));
	  quantity.sendKeys("10");
	  logger.log(LogStatus.PASS, "buy dog passed");
	  extent.endTest(logger);
	  Thread.sleep(4000);
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
