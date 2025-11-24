import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  String s=driver.getTitle();
	  System.out.println(s);
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new EdgeDriver();
	  driver.get("http://demowebshop.tricentis.com");
  }
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
