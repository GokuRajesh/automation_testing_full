import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;
import com.relevantcodes.extentreports.LogStatus;

import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class tc2_search extends reporter{
	static int i=0;
	static WebDriver driver;
	  @Test
	  public void f() {
		  driver=new EdgeDriver();
		  logger=extent.startTest("employee name search test");
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  try {
			takeScreenshot();
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		  usernameField.sendKeys("Admin");
		  try {
			takeScreenshot();
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  try {
			takeScreenshot();
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			takeScreenshot();
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Admin")))).click();
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  try {
			takeScreenshot();
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  WebElement emp=driver.findElement(By.xpath("//*[contains(text(),'Employee Name')]"));
		  driver.findElement(with(By.tagName("input")).below(emp)).sendKeys("AAMIR  KHAN");
		  try {
			takeScreenshot();
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  try {
			takeScreenshot();
		} catch (WebDriverException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  if(driver.findElement(By.xpath("//span[contains(@class,'oxd-input-field-error-message')]")).isDisplayed()) {
			  logger.log(LogStatus.PASS,"employee name search test successfull");
			  assertTrue(false);
			  
		  }
		  else{
			  logger.log(LogStatus.FAIL,"employee name search test failed");
			  assertTrue(true);
		  };
		  extent.endTest(logger);
		  }
	  
	  static void takeScreenshot() throws WebDriverException, IOException {
		  System.out.println("taking screenshot");
		  File srcfile;
		  srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  Files.copy(srcfile,new File("C:\\Selenium demo\\orangehrm_maven\\screenshot\\steps"+i+".jpeg"));
		  i++;
	  }
	  @AfterTest
	  public void aftertest() {
		  driver.quit();
	  }
}
