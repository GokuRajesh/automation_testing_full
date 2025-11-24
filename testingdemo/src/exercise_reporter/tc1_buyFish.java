package exercise_reporter;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class tc1_buyFish extends reporter {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  logger=extent.startTest("tc1_buyfish");
	  driver.get("https://petstore.octoperf.com/");
	  driver.findElement(By.linkText("Enter the Store")).click();
	  System.out.println("Test started");
	  System.out.println("Test dog is under execution");
	  driver.findElement(By.xpath("//area[@alt='Fish']")).click();
	  driver.findElement(By.linkText("FI-SW-01")).click();
	  driver.findElement(By.linkText("Add to Cart")).click();
	  //WebElement quantity=driver.findElement(By.xpath("//tbody/tr[2]/td[5]/input"));
	  WebElement quantity=driver.findElement(By.name("EST-1"));
	  quantity.sendKeys("10");
	  logger.log(LogStatus.PASS, "buy fish passed");
	  extent.endTest(logger);
	  Thread.sleep(4000);
  }
 // //tbody//tr[td[contains(text(),'Large')]]//td[5]//input
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
