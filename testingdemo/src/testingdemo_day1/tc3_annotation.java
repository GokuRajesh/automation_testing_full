package testingdemo_day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class tc3_annotation {
	WebDriver driver;
  @Test
  public void tc1_register() throws InterruptedException {
	  driver.findElement(By.linkText("Register")).click();
	  driver.findElement(By.id("FirstName")).sendKeys("q1");
	  driver.findElement(By.id("LastName")).sendKeys("q2");
	  Thread.sleep(2000);
  }
  @Test
  public void tc2_login() throws InterruptedException {
	  driver.findElement(By.linkText("Log in")).click();
	  driver.findElement(By.id("Email")).sendKeys("q1@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("q21234");
	  Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver.get("https://demowebshop.tricentis.com/");
	  System.out.println("test started");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("test ended");
  }

  @BeforeTest
  public void beforeTest() {
	  driver=new EdgeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
