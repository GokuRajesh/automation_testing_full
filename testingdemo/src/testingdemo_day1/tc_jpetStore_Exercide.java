package testingdemo_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc_jpetStore_Exercide {
	WebDriver driver;
  @Test
  public void tc1() {
	  System.out.println("Test fish is under execution");
	  driver.findElement(By.xpath("//area[@alt='Fish']")).click();
	  driver.findElement(By.linkText("FI-SW-01")).click();
	  
  }
  @Test
  public void tc2() {
	  System.out.println("Test dog is under execution");
	  driver.findElement(By.xpath("//area[@alt='Dogs']")).click();
	  driver.findElement(By.linkText("K9-BD-01")).click();
  }
  @BeforeMethod
  public void beforemethod() {
	  driver.get("https://petstore.octoperf.com/");
	  driver.findElement(By.linkText("Enter the Store")).click();
	  System.out.println("Test started");
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
