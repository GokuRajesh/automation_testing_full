package exercise_reporter;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class tc3_buyCats extends reporter {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  try {
		  logger=extent.startTest("tc2_buydog");
		  driver.get("https://petstore.octoperf.com/");
		  driver.findElement(By.linkText("Enter the Store")).click();
		  System.out.println("Test started");
		  System.out.println("Test dog is under execution");
		  driver.findElement(By.xpath("//area[@alt='Cats']")).click();
		  driver.findElement(By.linkText("FL-DSH-01")).click();
		  driver.findElement(By.linkText("Add to Cart")).click();
		  WebElement quantity=driver.findElement(By.name("EST-14"));
		  quantity.sendKeys("10");
		  assertEquals(quantity.getAttribute("value"),"10");
		  
		  logger.log(LogStatus.FAIL, "buy cats passed");
	  
		  extent.endTest(logger);
		  Thread.sleep(4000);
	  }
	  catch(Exception e) {
		  logger.log(LogStatus.FAIL, "buy cats failed");
		  System.out.println(e);
	  }
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
