import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class tc1_login extends reporter{
	WebDriver driver;
  @Test
  public void f() {
	  driver=new EdgeDriver();
	  logger=extent.startTest("login test");
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	  usernameField.sendKeys("Admin");

	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  try {
		  wait.until(ExpectedConditions.urlToBe("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index")); 
		  assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		  logger.log(LogStatus.PASS, "Login test successful");
	  }
	  catch(Exception e) {
		  logger.log(LogStatus.FAIL, "Login test failed");
	  }
	  extent.endTest(logger);
	  }
  @AfterTest
  public void aftertest() {
	  driver.quit();
  }
}
