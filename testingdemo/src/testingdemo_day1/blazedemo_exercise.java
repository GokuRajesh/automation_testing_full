package testingdemo_day1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class blazedemo_exercise {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String from, String to) throws InterruptedException {
	  driver.get("https://blazedemo.com/");
	  Select src=new Select(driver.findElement(By.name("fromPort")));
	  src.selectByVisibleText(from);
	  Select dest=new Select(driver.findElement(By.name("toPort")));
	  dest.selectByVisibleText(to);
	  driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	  Thread.sleep(4000);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Paris", "Berlin" },
      new Object[] { "Boston", "Rome" },
      new Object[] { "Portland", "New York" },
    };
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
