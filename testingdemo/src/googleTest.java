import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class googleTest {
  @Test(dataProvider = "dp")
  public void f(String searchText) throws InterruptedException {
	  WebDriver driver=new EdgeDriver();
	  driver.get("http://www.google.co.in");
	  driver.findElement(By.name("q")).sendKeys(searchText);
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(4000);
	  driver.quit();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"a"},
      new Object[] {"b"},
    };
  }
}
