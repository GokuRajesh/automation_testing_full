package testingdemo_day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  Select src=new Select(driver.findElement(By.name("fromPort")));
	  src.getFirstSelectedOption().click();
	  Select dest=new Select(driver.findElement(By.name("toPort")));
	  dest.getFirstSelectedOption().click();
	  driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	  
	  String actTitle=driver.getTitle();
	  assertEquals(actTitle,"BlazeDemo - reserve");
	  Thread.sleep(2000);
	  }
  @BeforeTest
  public void beforeTest() {
	  driver=new EdgeDriver();
	  driver.get("https://blazedemo.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
