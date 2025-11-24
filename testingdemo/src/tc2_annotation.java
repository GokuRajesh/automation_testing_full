import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class tc2_annotation {
	WebDriver driver;
  @Test
  public void f() {
	  String s=driver.getTitle();
	  assertEquals(s, "Google");
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new EdgeDriver();
	  driver.get("http://www.google.co.in");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
