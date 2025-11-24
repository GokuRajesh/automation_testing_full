import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class tc4 extends reporter{
	WebDriver driver;
  @Test
  public void f() {
	  driver=new EdgeDriver();
	  logger=extent.startTest("search leave upper test");
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
	  usernameField.sendKeys("Admin");
	  
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  WebElement search=
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search')]")));
	  
	 search.sendKeys("lEAVE");
	  if(driver.findElement(By.linkText("Leave")).isDisplayed()) {
		  assertTrue(true);
		  logger.log(LogStatus.PASS, "search leave upper successful");
	  }
	  else {
		  assertTrue(false);
		  logger.log(LogStatus.FAIL, "search leave upper failed");
	  }
	  extent.endTest(logger);
	  
  }
  @AfterTest
  public void aftertest() {
	  driver.quit();
  }
}
